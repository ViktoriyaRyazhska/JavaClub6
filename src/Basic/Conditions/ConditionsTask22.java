package Conditions;

import java.util.Scanner;

public class ConditionsTask22 {
    public static String bonusTime() {
        System.out.println("It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?\n" +
                "\n" +
                "Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.\n" +
                "\n" +
                "If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.\n" +
                "\n" +
                "Return the total figure the individual will receive as a string prefixed with \"£\"\n");
        System.out.print("Enter your salary: ");
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        System.out.print("Bonus:[true] or [false]?");
        boolean bonus = sc.nextBoolean();
        int totalSalary;
        if (bonus) {
            totalSalary = salary * 10;
        } else totalSalary = salary;
        System.out.println("Your salary is " + "\u00A3" + totalSalary);
        return "\u00A3" + totalSalary;
    }
}

