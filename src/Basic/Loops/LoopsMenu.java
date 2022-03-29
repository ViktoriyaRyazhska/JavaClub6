package Loops;

import java.util.Scanner;

public class LoopsMenu {
    public static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the number of tasks from 33 to 47:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 33:
                break;
            case 34:
                LoopsTask34.humanYearsCatYearsDogYears();
                break;
            case 35:
                break;
            case 36:
                LoopsTask36.map();
                break;
            case 37:
                break;
            case 38:
                break;
            case 39:
                LoopsTask39.betterThanAverage();
                break;
            case 40:
                break;
            case 41:
                LoopsTask41.sum();
                break;
            case 42:
                break;
            case 43:
                break;
            case 44:
                LoopsTask44.findNearestSquare();
                break;
            case 45:
                break;
            case 46:
                LoopsTask46.gap();
                break;
            case 47:
                break;

        }
    }
}

