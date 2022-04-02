package Conditions;

import java.util.Scanner;

public class ConditionsTask27 {
    public static String boolToWord() {
        String value;

        System.out.println("Enter words [true] or [false]");

        Scanner sc = new Scanner(System.in);
        Boolean b = sc.nextBoolean();


        if (b == true) {
            value = "Yes";
        } else value = "No";

        System.out.println(value);

        return value;
    }
}
