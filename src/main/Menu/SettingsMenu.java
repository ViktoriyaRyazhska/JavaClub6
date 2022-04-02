package main.Menu;

import main.Basic.BasicMenu;
import main.Classes.ClassMenu;
import main.Collections.CollectionsMenu;

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
//                case 2:
//                    ClassesMenu.chooseTask();
//                    break;
//                case 3:
//                    ConditionsMenu.chooseTask();
//                    break;
//                case 4:
//                    LoopsMenu.chooseTask();
//                    break;
//                case 5:
//                    StringProgramMenu.chooseTask();
//                    break;
//                case 6:
//                    OOPMenu.chooseTask();
//                    break;
//                case 7:
//                    CollectionsMenu.chooseTask();
//                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Error, wrong answer");
                    menuTitle();

            }
        }
    }
}
