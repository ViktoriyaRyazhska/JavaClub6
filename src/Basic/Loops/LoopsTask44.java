package Loops;

import java.util.Scanner;

public class LoopsTask44 {
    public static int findNearestSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.");
        System.out.print("Put your positive number=");
        int num = scanner.nextInt();
        int result = (int) Math.round(Math.sqrt(num));
        return result * result;

    }
}
