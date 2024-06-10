public class CalculatorView {

  private final CalculatorController controller;

  public CalculatorView(CalculatorController controller) {
    this.controller = controller;
  }

  public void calculate() {
    while (true) {
      Command command = controller.selectActivity();
      if (command == Command.EXIT) {
        break;
      }
      int firstNumber = controller.inputFirstNumber();
      int secondNumber = controller.inputSecondNumber();
      controller.printResult(firstNumber, secondNumber, command);
    }
  }
}
