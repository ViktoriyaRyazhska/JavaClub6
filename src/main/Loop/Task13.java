package main.Loop;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=scanner.nextInt();
        System.out.println("Result:  Sum = "+summation(number));
    }

    public static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
