package main.Basic;

public class Task7 {
    // https://www.codewars.com/kata/beginner-series-number-2-clock/
    public static void main(String[] args) {
        System.out.println(past(0, 1, 1));
    }

    public static int past(int h, int m, int s) {
        return h * 3600000 + m * 60000 + s * 1000;
    }
}
    