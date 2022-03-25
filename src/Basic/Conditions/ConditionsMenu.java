package Conditions;

import Conditions.ConditionsTask24;
import Conditions.ConditionsTask29;

import java.util.Scanner;

public class ConditionsMenu {
    public static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the number of tasks from 19 to 32:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
               ConditionsTask24.rps();
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            case 29:
                ConditionsTask29.sequence(5);
                break;
            case 30:
                break;
            case 31:
                break;
            case 32:
                break;
        }
    }
}