package Loops;

public class Task15 {

    public static int makeMove(int sticks) {

        int value;

        if (sticks == 18 || sticks == 14 || sticks == 10 || sticks == 6 || sticks == 2) {
            value = 2;
        } else if (sticks == 19 || sticks == 15 || sticks == 11 || sticks == 7 || sticks == 3) {
            value = 3;
        } else {
            value = 1;
        }

        return value;
    }
}


