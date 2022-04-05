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
    public void helloMenu() {
        System.out.println(Main.ANSI_PURPLE + "WELCOME TO MAIN MENU");
        System.out.println("CHOOSE THE NUMBER OF TOPIC:");
        System.out.println("BASIC PROGRAM -1");
        System.out.println("CLASSES-2");
        System.out.println("CONDITIONS-3");
        System.out.println("LOOPS-4");
        System.out.println("STRING-5");
        System.out.println("OOP-6");
        System.out.println("COLLECTIONS-7");
        System.out.println("EXIT-0" + Main.ANSI_RESET);
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
                    ClassesMenu.chooseTask(scanner);
                    break;
                case 3:
                    ConditionsMenu.chooseTask(scanner);
                    break;
                case 4:
                    LoopsMenu.chooseTask(scanner);
                    break;
                case 5:
                    StringProgramMenu.chooseTask(scanner);
                    break;
                case 6:
                    OOPMenu.chooseTask(scanner);
                    break;
                case 7:
                    CollectionsMenu.chooseTask(scanner);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Error, wrong answer, put number from 1 to 7");
            }
        }
    }
}