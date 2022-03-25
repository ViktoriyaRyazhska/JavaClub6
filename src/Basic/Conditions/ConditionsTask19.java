package Conditions;

import java.util.Scanner;

public class ConditionsTask19 {
    public static void opposite()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make opposite number");
        System.out.print("Put your number, n= ");
        int number=scanner.nextInt();
        System.out.println("opposite number of "+ number+ " is " + number*(-1));
    }

}
