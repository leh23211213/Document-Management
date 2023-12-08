package Controller;

import DataAccess.IDataAccess;
import DataAccess.Repository;
import Models.Model;

public class ModelsController {
  public Repository Repository;

  public ModelsController(IDataAccess context) {
    this.Repository = new Repository(context);
  }

  public void render(String id) {
    Model model = Repository.Select(id);
    System.out.println(Repository._context.models);
  }
}
