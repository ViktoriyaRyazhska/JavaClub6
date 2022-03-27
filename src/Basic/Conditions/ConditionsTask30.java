//Switch it Up!
//https://www.codewars.com/kata/switch-it-up/
//Author:Maksim Dziurei

package Conditions;

import java.util.Scanner;

public class ConditionsTask30 {
    public static String switchItUp() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Switch it up!");
        System.out.print("Enter your number: ");
        number = sc.nextInt();
        if (number == 0)
            return "Zero";
        if (number == 1)
            return "One";
        if (number == 2)
            return "Two";
        if (number == 3)
            return "Three";
        if (number == 4)
            return "Four";
        if (number == 5)
            return "Five";
        if (number == 6)
            return "Six";
        if (number == 7)
            return "Seven";
        if (number == 8)
            return "Eight";
        if (number == 9)
            return "Nine";
        return "";
    }
}
