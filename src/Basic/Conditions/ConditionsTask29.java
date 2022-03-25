package Conditions;

import java.util.Scanner;

public class ConditionsTask29 {
    public static int sequence(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Consider a sequence where the first two numbers are 0 and 1 and the next number \n" +
                "of the sequence is the sum of the previous 2 modulo 3.\n" +
                " Write a function that finds the nth number of the sequence.");
        System.out.println("N=");
//         n = scanner.nextInt();
        if (n<=1){
            return n;
        } return sequence(n-1)+sequence(n-2);

        }
    }


