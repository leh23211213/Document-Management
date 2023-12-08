import Controller.ModelsController;
import DataAccess.FileAccess;
import DataAccess.IDataAccess;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    String ext = "E:\\IT\\VSCode\\Github\\Document-Management\\src\\Book.txt";
    IDataAccess context = new FileAccess(ext);
    ModelsController controller = new ModelsController(context);

    // Scanner sc = new Scanner(System.in);
    // while (true) {
    //   String userInput = sc.nextLine();
    //   String request = userInput.trim().toLowerCase();
    //   if (request.equalsIgnoreCase("q") || request.equalsIgnoreCase("quit"))
    //     break;
    //   switch (request) {
    //   case "save":
    //     break;
    //   case "render1":
    //     break;
    //   default:
    //     break;
    //   }
    // }
  }
}