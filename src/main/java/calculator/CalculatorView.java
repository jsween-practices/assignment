package calculator;

final class CalculatorView {

  private final CalculatorController controller;

  public CalculatorView(final CalculatorController controller) {
    this.controller = controller;
  }

  void calculate() {
    while (true) {
      final Command command = controller.selectActivity();
      if (command == Command.EXIT) {
        break;
      }
      final int firstNumber = controller.inputFirstNumber();
      final int secondNumber = controller.inputSecondNumber();
      controller.printResult(firstNumber, secondNumber, command);
    }
  }
}
