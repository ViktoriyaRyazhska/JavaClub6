package main.Classes;

import main.Classes.Task3.Main;
import main.Menu.SettingsMenu;

import java.util.Scanner;

public class ClassMenu {
    public static void chooseNumberOfTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose number of task:(1,2,3,5,6)\t| To back to Main Menu enter 0");
        int numberOfTask = scanner.nextInt();
        switch (numberOfTask){
            case 1:
                System.out.println("This task do nothing");
                chooseNumberOfTask();
                break;
            case 2:
                main.Classes.Task2.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 3:
                Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 5:
                System.out.println("NOW YOU WILL SEE THE FIGHT");
                main.Classes.Task5.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 6:
                main.Classes.Task6.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 0:
                SettingsMenu.topicNumberOfPackages();
            default:
                final String ANSI_RED = "\u001B[31m";
                final String ANSI_RESET = "\u001B[0m";
                System.out.println(ANSI_RED+"There is not task with number " + numberOfTask+ANSI_RESET);
                chooseNumberOfTask();
        }
    }
}
