package calculator;

final class CalculatorService {
  int calculate(final int firstNumber, final int secondNumber, final Command command) {
    switch (command) {
      case Command.PLUS -> {
        return firstNumber + secondNumber;
      }
      case Command.MINUS -> {
        return firstNumber - secondNumber;
      }
      case Command.MULTI -> {
        return firstNumber * secondNumber;
      }
      case Command.DEVIDE -> {
        return firstNumber / secondNumber;
      }
      default -> throw new RuntimeException("발생하지 않는 케이스입니다.");
    }
  }
}
