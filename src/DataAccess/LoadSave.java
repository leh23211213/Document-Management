package DataAccess;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import Models.Book;
import Models.Megazine;
import Models.Model;
import Models.Newspaper;

public class LoadSave implements IDataAccess {
    public Repository Repository;

    private String filePath = "data.txt";

    public void set_file(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void Load() {
        try {
            File f = new File(filePath);
            if (!f.exists()) {
                Save();
                return;
            }
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
                    Repository.models.add(new Book(id, authors, title, publisher, publishedQuantity, numOfPages));
                } else if (id.charAt(0) == 'M') {
                    int issueNumber = Integer.parseInt(line.next());
                    int issMonth = Integer.parseInt(line.next());
                    Repository.models.add(
                            new Megazine(id, authors, title, publisher, publishedQuantity, issueNumber, issMonth));
                } else if (id.charAt(0) == 'N') {
                    int issueDay = Integer.parseInt(line.next());
                    Repository.models.add(
                            new Newspaper(id, authors, title, publisher, publishedQuantity, issueDay));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void Save() {
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Model model : Repository.models) {
                bw.write(model.toString());
                bw.newLine();
            }
            fw.close();
            fw.close();
            System.out.println("Save file success!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
