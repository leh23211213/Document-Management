
import DataAccess.IDataAccess;
import DataAccess.LoadSave;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    IDataAccess context = new LoadSave();
    // ModelsController controller = new ModelsController(context);

    Scanner sc = new Scanner(System.in);
    String userInput = sc.nextLine();
    String request = userInput.trim().toLowerCase();
    while (true) {
      if (request.equalsIgnoreCase("q") || request.equalsIgnoreCase("quit"))
        break;
      switch (request) {
      case "value":
        break;
      default:
        break;
      }
    }
  }
}