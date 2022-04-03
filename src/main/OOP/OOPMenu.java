package main.OOP;

import main.Menu.SettingsMenu;
import main.OOP.OOPTask1.God;

import java.util.Scanner;

public class OOPMenu {
    public static void chooseNumberOfTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose number of task:(1,2)\t| To back to Main Menu enter 0");
        int numberOfTask = scanner.nextInt();
        switch (numberOfTask) {
            case 1:
                God.create();
                chooseNumberOfTask();
                break;
            case 2:
                main.OOP.Task1.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 0:
                SettingsMenu.topicNumberOfPackages();
            default:
                final String ANSI_RED = "\u001B[31m";
                final String ANSI_RESET = "\u001B[0m";
                System.out.println(ANSI_RED + "There is not task with number " + numberOfTask + ANSI_RESET);
                chooseNumberOfTask();
        }
    }
}
