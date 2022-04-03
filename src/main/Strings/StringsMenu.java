package main.Strings;

import main.Menu.SettingsMenu;

import java.util.Scanner;

public class StringsMenu {
    public static void chooseNumberOfTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose number of task:(1,2,4,6,7,9,11,12,14,16,17)\t| To back to Main Menu enter 0");
        int numberOfTask = scanner.nextInt();
        switch (numberOfTask) {
            case 1:
                Task1.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 2:
                Task2.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 4:
                Task4.main(new String[]{});
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
            case 9:
                Task9.main(new String[]{});
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
            case 14:
                Task14.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 16:
                Task16.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 17:
                Task17.main(new String[]{});
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
