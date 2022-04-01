package Basic;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(century(1962));
    }

    public static int century(int number) {
        double temp = (number - 1) / 100.0;
        return (int) temp + 1;
    }
}