package Collections;

import Main.Main;

import java.util.Scanner;

public class CollectionsMenu {
    public static void chooseTask(Scanner scanner) {

        System.out.println("Choose the number of tasks from 70 to 73:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 70:
                CollectionsTask70.push();
                break;
            case 71:
                CollectionsTask71.CreateList();
                break;
            case 72:
                break;
            case 73:
                break;
            default:
                System.out.println(Main.RED_UNDERLINED +"Error, wrong answer"+Main.ANSI_RESET);
                chooseTask(scanner);
        }
    }
}
