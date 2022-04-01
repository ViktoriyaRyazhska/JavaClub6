package Conditions;

public class Task11 {
    public static void main(String[] args) {

    }

    public static int sequence(int n) {
        int number = 0;
        int k = 2;
        int a = 0;
        int b = 1;

        while (k < n) {
            number = (a + b) % 3;
            a = b;
            b = number;

            k++;
        }

        return number;
    }
}