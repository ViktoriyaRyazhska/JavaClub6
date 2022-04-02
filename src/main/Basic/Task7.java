package main.Basic;

import java.util.Scanner;

public class Task7 {
    // https://www.codewars.com/kata/beginner-series-number-2-clock/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Hours: ");
        int h = scanner.nextInt();
        System.out.print("Enter Minutes: ");
        int m = scanner.nextInt();
        System.out.print("Enter Seconds: ");
        int s = scanner.nextInt();
        System.out.println("Time since midnight in milliseconds "+past(h, m, s));
    }

    public static int past(int h, int m, int s) {
        return h * 3600000 + m * 60000 + s * 1000;
    }
}
    