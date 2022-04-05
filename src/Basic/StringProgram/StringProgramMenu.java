package StringProgram;

import Main.Main;

import java.util.Scanner;

public class StringProgramMenu {
    public static void chooseTask(Scanner scanner) {
        System.out.println("Choose the number of tasks from 52 to 69:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 52:
                break;
            case 53:
                break;
            case 54:
                StringProgramTask54.sayHello();
                break;
            case 55:
                StringProgramTask55.oppositeNum();
                break;
            case 56:
                StringProgramTask56.replaceDots();
                break;
            case 57:
                break;
            case 58:
                break;
            case 59:
                StringProgramTask59.tripleTrouble();
                break;
            case 60:
                StringProgramTask60.findThePosition();
                break;
            case 61:
                StringProgramTask61.fakeBin();
                break;
            case 62:
                break;
            case 63:
                break;
            case 64:
                StringProgramTask64.abbrevName();
                break;
            case 65:
                break;
            case 66:
                StringProgramTask66.twoSort();
                break;
            case 67:
                break;
            case 68:
                break;
            case 69:
                StringProgramTask69.remove();
                break;
            default:
                System.out.println(Main.RED_UNDERLINED +"Error, wrong answer"+Main.ANSI_RESET);
                chooseTask(scanner);
        }
    }
}

