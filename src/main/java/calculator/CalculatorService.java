package calculator;

class CalculatorService {
  int calculate(int firstNumber, int secondNumber, Command command) {
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
