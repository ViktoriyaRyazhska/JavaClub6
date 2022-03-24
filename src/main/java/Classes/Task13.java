package Classes;

public class Task13 {

  private static int ONE_HUNDRED = 100;
  public static final Task13 INST = new Task13();

  private final int value;

  private Task13() {
    value = ONE_HUNDRED;
  }

  public int plus100(int n) {
    return value + n;
  }
}