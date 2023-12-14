import Controller.ModelsController;
import DataAccess.FileAccess;
import DataAccess.IDataAccess;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    String ext =
        "E:\\IT\\VSCode\\Github\\Document-Management\\src\\getData.txt";
    IDataAccess context = new FileAccess(ext);
    ModelsController controller = new ModelsController(context);
    controller.Render();        // print
    controller.Insert();        // insert
    controller.Delete("B01");   // delete with Book ID
    controller.renderType("B"); // find document list with type of.
  }
}