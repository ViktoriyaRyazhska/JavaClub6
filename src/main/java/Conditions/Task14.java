package Conditions;

/**   Task 14
 * @author MichaelShv*/

public class Task14 {
    public static int rentalCarCost(int d) {
        int sum = d * 40;
        if (d >= 3 && d < 7) {
            return(sum - 20);
        } else if (d >= 7) {
            return(sum - 50);
        } else {
            return(sum);
        }
    }
}
