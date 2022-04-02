package Main;

import BasicPrograms.BasicProgramsMenu;
import Classes.ClassesMenu;
import Collections.CollectionsMenu;
import Conditions.ConditionsMenu;
import Loops.LoopsMenu;
import OOP.OOPMenu;
import String.StringMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello, please choose group of tasks:");
            System.out.println("1 - Basic Programs;\n2 - Classes;\n3 - Collections;\n4 - Conditions;\n5 - Loops;\n6 - OOP;\n7 - String.");
            System.out.print("Please enter the number of Group or type 0 to exit: ");
            Scanner in = new Scanner(System.in);
            int group = in.nextInt();
            switch (group) {
                case 0:
                    return;
                case 1:
                    BasicProgramsMenu.call();
                    break;
                case 2:
                    ClassesMenu.call();
                    break;
                case 3:
                    CollectionsMenu.call();
                    break;
                case 4:
                    ConditionsMenu.call();
                    break;
                case 5:
                    LoopsMenu.call();
                    break;
                case 6:
                    OOPMenu.call();
                    break;
                case 7:
                    StringMenu.call();
                    break;
                default:
                    System.out.println("No group found. Try again.");
                    break;
            }
        }
    }
}
