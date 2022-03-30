package Conditions;

public class Task14 {
    //    https://www.codewars.com/kata/transportation-on-vacation/
    private static final int DAY_PRICE = 40;

    public static int rentalCarCost(int d) {
        int total = d * DAY_PRICE;
        if (d >= 7) {
            total -= 50;
        } else if (d >= 3) {
            total -= 20;
        }
        return total;

    }
}
