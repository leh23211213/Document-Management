package DataAccess;

import java.util.ArrayList;

import Models.Model;

public class Repository {
    public ArrayList<Model> models = new ArrayList<>();
    public IDataAccess _context;

    public Repository(IDataAccess context) {
        this._context = context;
        _context.Load();
    }

    public void Save() {
        _context.Save();
    }

  
    public Model select(String id) {
        Model temp = null;
        for (Model model : models) {
            if (model.getId() == id) {
                temp = model;
            } else
                System.out.println("Can't found!");
        }
        return temp;
    }
}
