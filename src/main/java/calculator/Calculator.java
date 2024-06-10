package calculator;

import support.InputManager;

public class Calculator {
  private final CalculatorView view;
  public Calculator(InputManager inputManager) {
    CalculatorController controller = new CalculatorController(inputManager,
        new CalculatorOutputManager(), new CalculatorService());
    this.view = new CalculatorView(controller);
  }

  public void calculate() {
    view.calculate();
  }
}
