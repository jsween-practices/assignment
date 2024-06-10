import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    InputManager inputManager = new InputManager(new Scanner(System.in));
    CalculatorService service = new CalculatorService();
    CalculatorController controller = new CalculatorController(inputManager, new OutputManager(), service);
    CalculatorView calculator = new CalculatorView(controller);
    calculator.calculate();
    inputManager.close();
  }
}
