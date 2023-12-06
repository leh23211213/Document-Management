package Controller;

import DataAccess.IDataAccess;
import DataAccess.Repository;
import Models.Model;

public class ModelsController {
    protected Repository Repository;

    public ModelsController(IDataAccess context) {
        Repository = new Repository(context);
    }

    public void Render(String id) {
        Model model = Repository.select(id);
        System.out.println();
    }
}
