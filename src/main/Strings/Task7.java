package main.Strings;

import java.util.Scanner;

public class Task7 {
    // https://www.codewars.com/kata/remove-string-spaces/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String  str= scanner.nextLine();
        System.out.println("Result: "+removeSpaces(str));
    }

    public static String removeSpaces(final String x) {
        return x.replaceAll(" ", "");
    }
}