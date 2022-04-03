package main.Strings;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int  number= scanner.nextInt();
        System.out.println("Result: "+opposite(number));
    }

    public static int opposite(int number) {
        return -number;
    }
}
