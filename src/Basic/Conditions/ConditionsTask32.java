package Conditions;

import java.util.Scanner;

public class ConditionsTask32 {
    public static int rentalCarCost() {
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
