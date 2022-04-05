package Classes;

public class ClassTask13 {
    public static ClassTask13 INST = new ClassTask13();

    private static int ONE_HUNDRED = 100;

    private static int value;

    static{
        value = 100;
    }

    private ClassTask13() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}
