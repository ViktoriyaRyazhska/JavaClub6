package Conditions;

import java.util.Scanner;

public class ConditionsTask29 {
    public static void sequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Consider a sequence where the first two numbers are 0 and 1 and the next number \n" +
                "of the sequence is the sum of the previous 2 modulo 3.\n" +
                " Write a function that finds the nth number of the sequence.");
        System.out.print("n=");
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println(n);
        }
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < n; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        System.out.println(f[n-1]);
    }
}

