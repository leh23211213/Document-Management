package Controller;

import DataAccess.IDataAccess;
import DataAccess.Repository;
import java.util.Scanner;

public class ModelsController {
  public Repository Repository;
  Scanner sc = new Scanner(System.in);

  public ModelsController(IDataAccess context) {
    this.Repository = new Repository(context);
  }

  public void Render() {
    var model = Repository.Select("B01");
    System.out.println(model.toString());
  }

  public void Insert() {
    System.out.println(
        "What you want to insert 'book','megazine','newspaper' ?");
    String userInput = sc.nextLine();
    String request = userInput.trim().toLowerCase();
    if (request.equalsIgnoreCase("book")) {
      Repository.insertBook();
    } else if (request.equalsIgnoreCase("megazine")) {
      Repository.insertMegazine();
    } else if (request.equalsIgnoreCase("newspaper")) {
      Repository.insertNewspaper();
    } else {
      System.out.println("Insert Error!");
      return;
    }
    System.out.println("Insert success!");
  }

  public void Delete(String id) {
    var model = Repository.Select(id);
    if (Repository.Delete(id)) {
      System.out.println("Delete " + model.getId() + " success!");
    } else
      System.out.println("Error!");
  }

  public void renderType(String key) {
    if (key == null)
      return;
    else {
      var list = Repository.SelectKey(key);
      System.out.println(list);
    }
  }
}
