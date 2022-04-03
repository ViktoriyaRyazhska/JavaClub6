package Conditions;

import java.util.Scanner;

public class ConditionsTask29 {

    public static int sequence(int n) {
        int first = 0;
        int second = 1;
        int third = 0;
        for (int i = 2; i < n; i++) {
            third = (first + second) % 3;
            first = second;
            second = third;
        }
        return third % 3;
    }


    public static int sequence(Scanner scanner) {
        System.out.println("Consider a sequence where the first two numbers are 0 and 1 and the next number \n" +
                "of the sequence is the sum of the previous 2 modulo 3.\n" +
                " Write a function that finds the nth number of the sequence.");
        System.out.print("n=");
        int first = 0;
        int second = 1;
        int third = 0;
        int n = scanner.nextInt();
        for (int i = 2; i < n; i++) {
            third = (first + second) % 3;
            first = second;
            second = third;
        }
        return third % 3;
    }
}

