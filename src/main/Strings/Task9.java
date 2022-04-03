package main.Strings;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter letter: ");
        char ch = scanner.next().charAt(0);
        System.out.println(position(ch));
    }

    public static String position(char alphabet) {
        int position = (int) alphabet - 96;

        return "Position of alphabet: " + position;
    }
}
