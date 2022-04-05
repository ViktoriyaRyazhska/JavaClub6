package Loops;

import Main.Main;

import java.util.Scanner;

import static Main.FirstHelloMenu.sorryMessage;

public class LoopsMenu {
    public static void chooseTask(Scanner scanner) {
        System.out.println("Choose the number of tasks from 33 to 47:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 33 -> sorryMessage(33);
            case 34 -> LoopsTask34.humanYearsCatYearsDogYears(scanner);
            case 35 -> LoopsTask35.getAverage(scanner);
            case 36 -> LoopsTask36.map(scanner);
            case 37 -> sorryMessage(37);
            case 38 -> sorryMessage(38);
            case 39 -> LoopsTask39.betterThanAverage(scanner);
            case 40 -> LoopsTask40.ReduceButGrow();
            case 41 -> LoopsTask41.sum(scanner);
            case 42 -> sorryMessage(42);
            case 43 -> sorryMessage(43);
            case 44 -> LoopsTask44.findNearestSquare();
            case 45 -> LoopsTask45.getAverage();
            case 46 -> LoopsTask46.gap(scanner);
            case 47 -> sorryMessage(47);
            default -> {
                System.out.println(Main.RED_UNDERLINED + "Error, wrong answer" + Main.ANSI_RESET);
                chooseTask(scanner);
            }
        }
    }
}

