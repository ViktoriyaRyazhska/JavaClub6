package Loops;

import java.util.Scanner;

public class LoopsMenu {
    public static void chooseTask(Scanner scanner) {
        System.out.println("Choose the number of tasks from 33 to 47:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 33:
                break;
            case 34:
                LoopsTask34.humanYearsCatYearsDogYears(scanner);
                break;
            case 35:
                LoopsTask35.getAverage(scanner);
                break;
            case 36:
                LoopsTask36.map(scanner);
                break;
            case 37:
                break;
            case 38:
                break;
            case 39:
                LoopsTask39.betterThanAverage(scanner);
                break;
            case 40:
                LoopsTask40.ReduceButGrow();
                break;
            case 41:
                LoopsTask41.sum(scanner);
                break;
            case 42:
                break;
            case 43:
                break;
            case 44:
                LoopsTask44.findNearestSquare();
                break;
            case 45:
                LoopsTask45.getAverage();
                break;
            case 46:
                LoopsTask46.gap(scanner);
                break;
            case 47:
                break;

        }
    }
}

