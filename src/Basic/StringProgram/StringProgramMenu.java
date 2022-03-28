package StringProgram;

import java.util.Scanner;

public class StringProgramMenu {
    public static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
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
                break;
            case 57:
                break;
            case 58:
                break;
            case 59:
                break;
            case 60:
                StringProgramTask60.findThePosition();
                break;
            case 61:
                break;
            case 62:
                break;
            case 63:
                break;
            case 64:
                break;
            case 65:
                break;
            case 66:
                break;
            case 67:
                break;
            case 68:
                break;
            case 69:
                break;
        }
    }
}

