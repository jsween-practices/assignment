import java.io.Closeable;
import java.util.Scanner;

public class InputManager implements Closeable {
  private final Scanner scanner;

  public InputManager(Scanner scanner) {
    this.scanner = scanner;
  }

  int inputInteger() {
    try {
      return Integer.parseInt(scanner.nextLine());
    } catch (NumberFormatException e) {
      throw new NotCorrectInputException();
    }
  }

  @Override
  public void close() {
    scanner.close();
  }
}
