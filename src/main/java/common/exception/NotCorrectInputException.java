package common.exception;

final public class NotCorrectInputException extends IllegalArgumentException {

  public NotCorrectInputException() {
    super("올바른 입력이 아닙니다.");
  }
}
