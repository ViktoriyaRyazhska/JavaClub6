package Conditions;

import java.util.Scanner;

public class ConditionsMenu {
    public static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the number of tasks from 19 to 32:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 19:
                ConditionsTask19.opposite();
                break;
            case 20:
                ConditionsTask20.divisible();
                break;
            case 21:
                ConditionsTask21.convert();
                break;
            case 22:
                ConditionsTask22.bonusTime();
                break;
            case 23:
                break;
            case 24:
                ConditionsTask24.rps();
                break;
            case 25:
                ConditionsTask25.basicOperations();
                break;
            case 26:
                ConditionsTask26.isLove();
                break;
            case 27: ConditionsTask27.boolToWord();
                break;
            case 28:
                break;
            case 29:
                ConditionsTask29.sequence();
                break;
            case 30:
                ConditionsTask30.switchItUp();
                break;
            case 31:
                ConditionsTask31.updateLight();
                break;
            case 32:
                ConditionsTask32.rentalCarCost();
                break;
        }
    }
}