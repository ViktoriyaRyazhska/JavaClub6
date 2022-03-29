package Basic;

public class Task7 {

    public static int past(int h, int m, int s) {
        return (1000 * s) + (60000 * m) + (3600000 * h);
    }

    public static void main(String[] args) {
        System.out.println(past(1, 1, 1));
    }
}
