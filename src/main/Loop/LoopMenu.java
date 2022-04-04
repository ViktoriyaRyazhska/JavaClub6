package main.Loop;

import main.Menu.SettingsMenu;

import java.util.Scanner;

public class LoopMenu {
    public static void chooseNumberOfTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose number of task:(1,2,3,5,6,7,8,10,11,12,13,15)\t| To back to Main Menu enter 0");
        int numberOfTask = scanner.nextInt();
        switch (numberOfTask) {
            case 1:
                Task1.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 2:
                main.Loop.Task2.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 3:
                Task3.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 5:
                Task5.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 6:
                Task6.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 7:
                Task7.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 8:
                Task8.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 10:
                Task10.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 11:
                Task11.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 12:
                Task12.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 13:
                Task13.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 15:
                Task15.main(new String[]{});
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
