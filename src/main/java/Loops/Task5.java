package Loops;
/**   Task 5
 * @author wertylu*/
public class Task5 {
    public static int countSheeps(Boolean[] arrayOfSheeps) {

        int total = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            if (arrayOfSheep == null) continue;
            if (arrayOfSheep == true) total += 1;
        }
        return total;
    }
}
