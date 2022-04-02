package main.Conditions.Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Operation: ");
        String op =scanner.next();
        System.out.print("Enter first number: ");
        int v1=scanner.nextInt();
        System.out.print("Enter second number: ");
        int v2=scanner.nextInt();
        System.out.println("Result: "+basicMath(op, v1, v2));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        int res = 0;
        if (op.equals("+")) {
            res = v1 + v2;
        }
        if (op.equals("-")) {
            res = v1 - v2;
        }
        if (op.equals("*")) {
            res = v1 * v2;
        }
        if (op.equals("/")) {
            if (v2 == 0) {
                System.out.println("ERROR");
            } else {
                res = v1 / v2;
            }

        }
        return res;
    }
}
