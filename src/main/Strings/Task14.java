package main.Strings;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scanner.nextLine();
        System.out.print("Enter letter to count: ");
        char c = scanner.next().charAt(0);
        System.out.println("Result: "+strCount(str,c));
    }

    public static int strCount(String str, char letter) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (letter == str.charAt(i)) {
                counter++;
            }
        }
        return counter;
    }
}
