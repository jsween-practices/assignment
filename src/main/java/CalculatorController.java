public class CalculatorController {

  private final InputManager inputManager;
  private final OutputManager outputManager;
  private final CalculatorService service;

  public CalculatorController(InputManager inputManager, OutputManager outputManager,
      CalculatorService service) {
    this.inputManager = inputManager;
    this.outputManager = outputManager;
    this.service = service;
  }

  public Command selectActivity() {
    outputManager.printSelectActivity();
    try {
      return Command.valueOf(inputManager.inputInteger());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return selectActivity();
    }
  }

  public int inputFirstNumber() {
    outputManager.printInputFirstNumber();
    try {
      return inputManager.inputInteger();
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return inputFirstNumber();
    }
  }

  public int inputSecondNumber() {
    outputManager.printInputSecondNumber();
    try {
      return inputManager.inputInteger();
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return inputSecondNumber();
    }
  }

  public void printResult(int firstNumber, int secondNumber, Command command) {
    int result = service.calculate(firstNumber, secondNumber, command);
    outputManager.printExpression(firstNumber, secondNumber, command, result);
  }
}
