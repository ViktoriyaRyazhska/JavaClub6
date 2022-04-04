package main.Conditions;

import main.Conditions.Task10.Task10;
import main.Conditions.Task2.Main;
import main.Conditions.Task5.AgeDiff;
import main.Menu.SettingsMenu;

import java.util.Scanner;

public class ConditionsMenu {
    public static void chooseNumberOfTask(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose number of task:(1,2,4,5,6,7,9,10,11,12,14)\t| To back to Main Menu enter 0");
        int numberOfTask = scanner.nextInt();
        switch (numberOfTask){
            case 1:
                main.Conditions.Task1.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 2:
                Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 4:
                main.Conditions.Task4.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 5:
                AgeDiff.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 6:
                main.Conditions.Task6.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 7:
                main.Conditions.Task7.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 9:
                main.Conditions.Task9.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 10:
                Task10.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 11:
                main.Conditions.Task11.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 12:
                main.Conditions.Task12.Main.main(new String[]{});
                chooseNumberOfTask();
                break;
            case 14:
                main.Conditions.Task14.Main.main(new String[]{});
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
