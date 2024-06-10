package calculator;

import support.InputManager;

final public class Calculator {
  private final CalculatorView view;
  public Calculator(final InputManager inputManager) {
    final CalculatorController controller = new CalculatorController(inputManager,
        new CalculatorOutputManager(), new CalculatorService());
    this.view = new CalculatorView(controller);
  }

  public void calculate() {
    view.calculate();
  }
}
