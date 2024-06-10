public class OutputManager {

  private final static String SELECT_ACTIVITY = "원하는 기능을 선택하세요\n 1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료";
  private final static String INPUT_FIRST_NUMBER = "첫번째 값을 입력하고 엔터를 누르세요.";
  private final static String INPUT_SECOND_NUMBER = "두번쨰 값을 입력하고 엔터를 누르세요.";

  public void printSelectActivity() {
    System.out.println(SELECT_ACTIVITY);
  }

  public void printInputFirstNumber() {
    System.out.println(INPUT_FIRST_NUMBER);
  }

  public void printInputSecondNumber() {
    System.out.println(INPUT_SECOND_NUMBER);
  }

  public void printExpression(int firstNumber, int secondNumber, Command command, int result) {
    System.out.println(firstNumber + " " + command.value + " " + secondNumber + " = " + result);
  }
}
