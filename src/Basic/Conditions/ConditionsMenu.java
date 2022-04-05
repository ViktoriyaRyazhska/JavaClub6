package Conditions;

import Main.Main;
import static Main.FirstHelloMenu.sorryMessage;
import java.util.Scanner;

public class ConditionsMenu {
    public static void chooseTask(Scanner scanner) {
        System.out.println("Choose the number of tasks from 19 to 32:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 19 -> ConditionsTask19.opposite();
            case 20 -> ConditionsTask20.divisible();
            case 21 -> ConditionsTask21.convert();
            case 22 -> ConditionsTask22.bonusTime();
            case 23 -> sorryMessage(23);
            case 24 -> ConditionsTask24.rps(scanner);
            case 25 -> ConditionsTask25.basicOperations();
            case 26 -> ConditionsTask26.isLove();
            case 27 -> ConditionsTask27.boolToWord();
            case 28 -> sorryMessage(28);
            case 29 -> ConditionsTask29.sequence(scanner);
            case 30 -> ConditionsTask30.switchItUp();
            case 31 -> ConditionsTask31.updateLight();
            case 32 -> ConditionsTask32.rentalCarCost();
            default -> {
                System.out.println(Main.RED_UNDERLINED + "Error, wrong answer" + Main.ANSI_RESET);
                chooseTask(scanner);
            }
        }
    }
}