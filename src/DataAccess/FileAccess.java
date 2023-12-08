package DataAccess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Models.Book;
import Models.Megazine;
import Models.Model;
import Models.Newspaper;

public class FileAccess implements IDataAccess {
  public ArrayList<Model> models = new ArrayList<>();
  public ArrayList<Model> getModels() { return models; }
  private String _file = "data.txt";
  private String filePath;

  public FileAccess(String filePath) { this.filePath = filePath; }
  public void render() { System.out.println(models.size()); }
  public void Load() {
    try {
      File f = new File(filePath);
      if (f.exists()) {
        System.out.println("Loading...");
        Scanner read = new Scanner(f);
        while (read.hasNext()) {
          Scanner line = new Scanner(read.nextLine());
          String id = line.next();
          String authors = line.next();
          String title = line.next();
          String publisher = line.next();
          int publishedQuantity = Integer.parseInt(line.next());
          if (id.charAt(0) == 'B') {
            int numOfPages = Integer.parseInt(line.next());
            models.add(new Book(id, authors, title, publisher,
                                publishedQuantity, numOfPages));
          } else if (id.charAt(0) == 'M') {
            int issueNumber = Integer.parseInt(line.next());
            int issMonth = Integer.parseInt(line.next());
            models.add(new Megazine(id, authors, title, publisher,
                                    publishedQuantity, issueNumber, issMonth));
          } else if (id.charAt(0) == 'N') {
            int issueDay = Integer.parseInt(line.next());
            models.add(new Newspaper(id, authors, title, publisher,
                                     publishedQuantity, issueDay));
          }
        }
        System.out.println("Load Success!");
      } else {
        System.out.println(" file not found !");
        return;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public void Save() throws IOException {

    try {
      FileWriter fw = new FileWriter(_file);
      BufferedWriter bw = new BufferedWriter(fw);
      for (Model model : models) {
        bw.write(model.toString());
        bw.newLine();
      }
      bw.close();
      fw.close();
      System.out.println("Save file success!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
