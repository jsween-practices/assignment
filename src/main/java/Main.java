import calculator.Calculator;
import java.util.Scanner;
import support.InputManager;

public class Main {

  public static void main(String[] args) {
    InputManager inputManager = new InputManager(new Scanner(System.in));
    Calculator calculator = new Calculator(inputManager);
    calculator.calculate();
    inputManager.close();
  }
}
