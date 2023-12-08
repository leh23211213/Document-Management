package DataAccess;

import Models.Model;
import java.io.IOException;
import java.util.List;

public class Repository {
  public IDataAccess _context;

  public Repository(IDataAccess context) {
    this._context = context;
    _context.Load();
  }

  public void Load() { _context.Load(); }

  public void Save() throws IOException { _context.Save(); }

  public List<Model> list() { return _context.getModels(); }

  public Model Select(String id) {
    Model temp = null;
    for (var each : list()) {
      if (each.getId().equalsIgnoreCase(id))
        return temp = each;
    }
    return null;
  }
}