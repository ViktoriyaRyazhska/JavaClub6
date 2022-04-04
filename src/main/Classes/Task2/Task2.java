package main.Classes.Task2;

public class Task2 {
    public static final Task2 INST = new Task2();

    private static final int ONE_HUNDRED = 100;

    private final int value;

    private Task2() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
