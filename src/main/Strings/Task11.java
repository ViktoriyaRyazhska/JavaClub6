package main.Strings;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age (Example: 5 years old): ");
        String str = scanner.nextLine();
        System.out.println("Result: You have " + HowOldAreYou(str) + " years");

    }

    public static int HowOldAreYou(String s) {
        char[] chars = s.toCharArray();
        String age="";
        for (char c : chars
        ) {
            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') {
                age = age + c;
            }

        }
        return Integer.parseInt(age);
    }
}
