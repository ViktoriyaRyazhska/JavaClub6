package main.Strings;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter number: ");
        long number = scanner.nextInt();
        System.out.println("Number to String: "+ToString(number));
    }

    public static String ToString(long number) {
        return Long.toString(number);
    }
}

