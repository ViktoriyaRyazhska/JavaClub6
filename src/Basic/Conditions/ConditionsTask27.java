package Conditions;

import java.util.Scanner;

public class ConditionsTask27 {
    public static String boolToWord() {
        System.out.println("Complete the method that takes a boolean value and return a " +
                "\"Yes\" string for true, or a \"No\" string for false.\n");
        String value;
        System.out.println("Enter words [true] or [false]");
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();

        if (b) {
            value = "Yes";
        } else value = "No";

        System.out.println(value);
        return value;
    }
}