package Classes;

public class task2 {

    private static int ONE_HUNDRED = 100;

    public static final task2 INST = new task2();

    private final int value;

    task2() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static void main(String[] args) {
        System.out.println(task2.INST.plus100(-100));
    }

}
