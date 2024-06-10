import java.util.Arrays;

public enum Command {
  PLUS("+"), MINUS("-"), MULTI("*"), DEVIDE("/"), EXIT("EXIT");
  public final String value;

  Command(String value) {
    this.value = value;
  }

  static Command valueOf(int ordinary) {
    return Arrays.stream(Command.values()).filter(command -> command.ordinal() == ordinary - 1)
        .findFirst().orElseThrow(NotCorrectInputException::new);
  }
}
