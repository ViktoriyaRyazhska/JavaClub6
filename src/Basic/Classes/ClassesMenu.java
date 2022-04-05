package Classes;

import Main.Main;

import java.util.Scanner;

public class ClassesMenu {
    public static void chooseTask(Scanner scanner) {

        System.out.println("Choose the number of tasks from 12 to 17:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 12: new ClassesTask12();
                break;
            case 13:
                break;
            case 14:
                ClassMenuTask14main.resTask14(scanner);
                break;
            case 15:
                ClassTask15main.resTask15(scanner);
                break;
            case 16:
                ClassTask16.declareWinner(scanner);
                break;
            case 17:
                break;
            default:
                System.out.println(Main.RED_UNDERLINED +"Error, wrong answer"+Main.ANSI_RESET);
                chooseTask(scanner);
        }
    }
}
