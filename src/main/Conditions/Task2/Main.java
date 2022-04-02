package main.Conditions.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        long n = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        System.out.println("IS DIVISIBLE: "+isDivisible(n, x, y));
    }

    public static boolean isDivisible(long n, long x, long y) {
        return n % x == 0 && n % y == 0;
    }
}
