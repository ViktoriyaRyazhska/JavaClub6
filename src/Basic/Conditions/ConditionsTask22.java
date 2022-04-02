package Conditions;

import java.util.Scanner;

public class ConditionsTask22 {
    public static String bonusTime() {

        System.out.println("Enter your salary");

        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        System.out.println("Enter boolean [true] or [false].");

        boolean bonus = sc.nextBoolean();
        int totalSalary;
        if (bonus == true) {
            totalSalary = salary * 10;
        } else totalSalary = salary;

        System.out.println("Your salary is " + "\u00A3" + totalSalary);

        return "\u00A3" + totalSalary;
    }
}
