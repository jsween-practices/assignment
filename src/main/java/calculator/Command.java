package calculator;

import common.exception.NotCorrectInputException;
import java.util.Arrays;

enum Command {
  PLUS("+"), MINUS("-"), MULTI("*"), DEVIDE("/"), EXIT("EXIT");
  public final String value;

  Command(final String value) {
    this.value = value;
  }

  static Command valueOf(final int ordinary) {
    return Arrays.stream(Command.values()).filter(command -> {
      if (ordinary == 0) {
        return command.ordinal() == 4;
      }
      return command.ordinal() == ordinary - 1;
    }).findFirst().orElseThrow(NotCorrectInputException::new);
  }
}
