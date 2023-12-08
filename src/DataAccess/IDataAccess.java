package DataAccess;

import Models.Model;
import java.io.IOException;
import java.util.ArrayList;

public interface IDataAccess {
  public ArrayList<Model> models = new ArrayList<>();
  public void Load();

  public void Save() throws IOException;

  public ArrayList<Model> getModels();
  public void render();
}
