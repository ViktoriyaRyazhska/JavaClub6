package Loops;

public class Task46 {
    public static int makeMove(int sticks) {
        return sticks % 4 == 0 ? 1 : sticks % 4;
    }
}
