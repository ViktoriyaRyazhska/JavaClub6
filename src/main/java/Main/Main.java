package Main;

import BasicPrograms.BasicProgramsMenu;
import Classes.ClassesMenu;
import Loops.LoopsMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, please choose group of tasks:");
        System.out.println("1 - Basic Programs;\n2 - Classes;\n3 - Collections;\n4 - Conditions;\n5 - Loops;\n6 - OOP;\n7 - String.");
        System.out.print("Please enter the number of Group: ");
        Scanner in = new Scanner(System.in);
        int group = in.nextInt();
        //in.close();
        switch (group){
            case 1:
                BasicProgramsMenu.call();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                LoopsMenu.call();
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
    }
}
