package Conditions;

import java.util.Scanner;

public class ConditionsTask32 {
    public static int rentalCarCost() {
        System.out.println("After a hard quarter in the office you decide to get some rest on a vacation." +
                " So you will book a flight for you and your girlfriend and try to leave all the mess behind you.\n" +
                "You will need a rental car in order for you to get around in your vacation. The manager of the car rental makes you some good offers.\n" +
                "Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively," +
                " if you rent the car for 3 or more days, you get $20 off your total.\n" +
                "\n" +
                "Write a code that gives out the total amount for different days(d).\n");
        int discountForThreeDays = 20;
        int discountForSevenDays = 50;
        int rentalCarForOneDay = 40;
        int totalRentCost = 0;

        System.out.println("Write for how many days do you want to rent a car");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        if (d < 3) {
            totalRentCost = d * rentalCarForOneDay;
        } else if (d >= 3 && d < 7) {
            totalRentCost = (d * rentalCarForOneDay) - discountForThreeDays;
        } else if (d >= 7) {
            totalRentCost = (d * rentalCarForOneDay) - discountForSevenDays;
        }

        System.out.println("You have to pay for " + d + " days " + totalRentCost + " dollars");
        return totalRentCost;
    }
}


