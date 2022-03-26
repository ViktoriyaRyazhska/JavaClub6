package Loops;

import java.util.Random;
import java.util.Scanner;

public class LoopsTask39 {
    public static void betterThanAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("There was a test in your class and you passed it. Congratulations!\n" +
                "But you're an ambitious person. You want to know if you're better than the average student in your class.\n" +
                "\n" +
                "You receive an array with your peers' test scores. Now calculate the average and compare your score!\n" +
                "\n" +
                "Return True if you're better, else False!" + "\n");
        System.out.print("Put number of students= ");
        int n = scanner.nextInt();
        int[] classPoints = new int[n];
        System.out.print("Your points are (from 1 to 100) = ");
        int yourPoints = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            classPoints[i] = random.nextInt(100);
        }
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum = sum + classPoints[i];
        }
        int totalSum = sum + yourPoints;
        double avg = (double) totalSum / (classPoints.length + 1);
        if (yourPoints > avg) System.out.println(true);
        else System.out.println(false);
    }
}

