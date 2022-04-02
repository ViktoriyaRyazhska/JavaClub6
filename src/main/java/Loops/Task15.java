package Loops;

/**   Task 15
 * @author MichaelShv*/

public class Task15 {
    public static int makeMove(int sticks) {
        int robotMove = sticks % 4;
        if (robotMove == 0) {
            return 1;
        } else {
            return robotMove;
        }
    }
}
