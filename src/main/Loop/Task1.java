package main.Loop;

import java.util.Scanner;

public class Task1 {
    // https://www.codewars.com/kata/string-repeat

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many times repeat: ");
        int repeat=scanner.nextInt();
        System.out.print("Enter word to repeat: ");
        String str = scanner.next();
        System.out.println(repeatStr(repeat, str));
    }
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return sb.toString();
    }
}
