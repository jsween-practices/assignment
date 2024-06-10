public class CalculatorService {
  public int calculate(int firstNumber, int secondNumber, Command command) {
    switch (command) {
      case PLUS -> {
        return firstNumber + secondNumber;
      }
      case MINUS -> {
        return firstNumber - secondNumber;
      }
      case MULTI -> {
        return firstNumber * secondNumber;
      }
      case DEVIDE -> {
        return firstNumber / secondNumber;
      }
      default -> throw new RuntimeException("발생하지 않는 케이스입니다.");
    }
  }
}
