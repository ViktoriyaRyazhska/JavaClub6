package Main;

import BasicProgram.BasicProgramMenu;
import Classes.ClassesMenu;
import Collections.CollectionsMenu;
import Conditions.ConditionsMenu;
import Loops.LoopsMenu;
import OOP.OOPMenu;
import StringProgram.StringProgramMenu;

import java.util.Scanner;

public class FirstHelloMenu {
    Scanner scanner = new Scanner(System.in);
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public void helloMenu() {
        System.out.println(ANSI_PURPLE+"WELCOME TO MAIN MENU");
        System.out.println("CHOOSE THE NUMBER OF TOPIC:");
        System.out.println("BASIC PROGRAM -1");
        System.out.println("CLASSES-2");
        System.out.println("CONDITIONS-3");
        System.out.println("LOOPS-4");
        System.out.println("STRING-5");
        System.out.println("OOP-6");
        System.out.println("COLLECTIONS-7");
        System.out.println("EXIT-0"+ANSI_RESET);
    }

    public void chooseTopicOfTask(Scanner scanner) {
        while (true) {
            helloMenu();
            int chooseNumber = scanner.nextInt();
            switch (chooseNumber) {
                case 1:
                    BasicProgramMenu.chooseTask(scanner);
                    break;
                case 2:
                    ClassesMenu.chooseTask();
                    break;
                case 3:
                    ConditionsMenu.chooseTask();
                    break;
                case 4:
                    LoopsMenu.chooseTask();
                    break;
                case 5:
                    StringProgramMenu.chooseTask();
                    break;
                case 6:
                    OOPMenu.chooseTask();
                    break;
                case 7:
                    CollectionsMenu.chooseTask();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Error, wrong answer");
                    helloMenu();

            }
        }
    }
}