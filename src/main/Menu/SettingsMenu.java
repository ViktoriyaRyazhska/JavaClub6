package main.Menu;

import main.Basic.BasicMenu;
import main.Classes.ClassMenu;
import main.Collections.CollectionsMenu;
import main.Conditions.ConditionsMenu;

import java.util.Scanner;

public class SettingsMenu {

    public static void menuTitle() {
        System.out.println("Choose number of Package");
        System.out.println("Basic -1");
        System.out.println("Classes-2");
        System.out.println("Collections-3");
        System.out.println("Conditions-4");
        System.out.println("Loop-5");
        System.out.println("OOP-6");
        System.out.println("Strings-7");
        System.out.println("Exit-0");
    }

    public static void topicNumberOfPackages() {
        while (true) {
            menuTitle();
            Scanner scanner = new Scanner(System.in);
            int chooseNumber = scanner.nextInt();
            switch (chooseNumber) {
                case 1:
                    BasicMenu.chooseNumberOfTask();
                    break;
                case 2:
                    ClassMenu.chooseNumberOfTask();
                    break;
                case 3:
                    CollectionsMenu.chooseNumberOfTask();
                    break;
                case 4:
                    ConditionsMenu.chooseNumberOfTask();
                    break;
                case 0:
                    System.exit(0);
                default:
                    final String ANSI_RED = "\u001B[31m";
                    final String ANSI_RESET = "\u001B[0m";
                    System.out.println(ANSI_RED+"ERROR"+ANSI_RESET+" You write a wrong number");
                    topicNumberOfPackages();
                    break;

            }
        }
    }
}
