package Conditions;

import java.util.Scanner;

public class ConditionsTask19 {
    public static void opposite()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make opposite number");
        int number=scanner.nextInt();
        System.out.println("opposite number of "+ number+ "is " + number*(-1));
    }

}
