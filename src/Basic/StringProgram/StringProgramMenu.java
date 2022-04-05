package StringProgram;

import Main.Main;
import static Main.FirstHelloMenu.sorryMessage;
import java.util.Scanner;

public class StringProgramMenu {
    public static void chooseTask(Scanner scanner) {
        System.out.println("Choose the number of tasks from 52 to 69:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 52 -> sorryMessage(52);
            case 53 -> sorryMessage(53);
            case 54 -> StringProgramTask54.sayHello();
            case 55 -> StringProgramTask55.oppositeNum();
            case 56 -> StringProgramTask56.replaceDots();
            case 57 -> sorryMessage(57);
            case 58 -> sorryMessage(58);
            case 59 -> StringProgramTask59.tripleTrouble();
            case 60 -> StringProgramTask60.findThePosition();
            case 61 -> StringProgramTask61.fakeBin();
            case 62 -> sorryMessage(62);
            case 63 -> sorryMessage(63);
            case 64 -> StringProgramTask64.abbrevName();
            case 65 -> sorryMessage(65);
            case 66 -> StringProgramTask66.twoSort();
            case 67 -> sorryMessage(67);
            case 68 -> sorryMessage(68);
            case 69 -> StringProgramTask69.remove();
            default -> {
                System.out.println(Main.RED_UNDERLINED + "Error, wrong answer" + Main.ANSI_RESET);
                chooseTask(scanner);
            }
        }
    }
}

