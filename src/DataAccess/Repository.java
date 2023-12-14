package DataAccess;

import Models.Book;
import Models.Megazine;
import Models.Model;
import Models.Newspaper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repository {
  public IDataAccess _context;
  Scanner sc = new Scanner(System.in);

  public Repository(IDataAccess context) {
    this._context = context;
    _context.Load();
  }

  public void Load() { _context.Load(); }

  public void Save() throws IOException { _context.Save(); }

  public ArrayList<Model> list() { return _context.getModels(); }

  public void render() { System.out.println(list().size()); }

  public Model Select(String id) {
    for (var each : list()) {
      if (each.getId().equalsIgnoreCase(id))
        return each;
    }
    return null;
  }

  public Model[] SelectKey(String key) {
    var temp = new ArrayList<>();
    for (var each : list()) {
      if (each.getId().charAt(0) == key.charAt(0))
        temp.add(each);
    }
    Model[] result = new Model[temp.size()];
    temp.toArray(result);
    return result;
  }

  public void insertBook() { _context.getModels().add(new Book()); }
  public void insertMegazine() { _context.getModels().add(new Megazine()); }
  public void insertNewspaper() { _context.getModels().add(new Newspaper()); }

  public boolean Delete(String id) {
    var m = Select(id);
    if (m == null)
      return false;
    _context.getModels().remove(m);
    return true;
  }
}