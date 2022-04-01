package Loops;

public class Task13 {
    public static void main(String[] args) {

    }

    public static int summation(int n) {
        int a = 1;
        int sum = 0;

        while (a <= n) {
            sum += a;
            a++;
        }

        return sum;
    }
}