package main.Strings;

import java.util.Scanner;

public class Task2 {
    // https://www.codewars.com/kata/reversed-strings
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String  str= scanner.nextLine();
        System.out.println("String reverse: "+reversedString(str));
    }
    public static String reversedString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
