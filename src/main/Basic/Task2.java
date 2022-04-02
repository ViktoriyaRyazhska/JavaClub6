package main.Basic;

import java.util.Scanner;

public class Task2 {
    // https://www.codewars.com/kata/function-3-multiplying-two-numbers/

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to Multiply: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Result - "+multiply(number1,number2));
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

}
