package Loops;

public class Task13 {
    public static int summation(int n) {
        int amount = 0;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            amount = i;
            sum += amount;
        }
        return sum;
    }
}
