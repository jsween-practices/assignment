package calculator;

import support.InputManager;

final class CalculatorController {

  private final InputManager inputManager;
  private final CalculatorOutputManager outputManager;
  private final CalculatorService service;

  CalculatorController(final InputManager inputManager, final CalculatorOutputManager outputManager,
      final CalculatorService service) {
    this.inputManager = inputManager;
    this.outputManager = outputManager;
    this.service = service;
  }

  Command selectActivity() {
    outputManager.printSelectActivity();
    try {
      return Command.valueOf(inputManager.inputInteger());
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return selectActivity();
    }
  }

  int inputFirstNumber() {
    outputManager.printInputFirstNumber();
    try {
      return inputManager.inputInteger();
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return inputFirstNumber();
    }
  }

  int inputSecondNumber() {
    outputManager.printInputSecondNumber();
    try {
      return inputManager.inputInteger();
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return inputSecondNumber();
    }
  }

  void printResult(final int firstNumber, final int secondNumber, final Command command) {
    final int result = service.calculate(firstNumber, secondNumber, command);
    outputManager.printExpression(firstNumber, secondNumber, command, result);
  }
}
