package OOP;

import static Main.FirstHelloMenu.sorryMessage;

import java.util.Scanner;

public class OOPMenu {
    public static void chooseTask(Scanner scanner) {
        System.out.println("Choose the number of tasks from 48 to 51:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 48 -> sorryMessage(48);
            case 49 -> sorryMessage(49);
            case 50 -> OOPTask50.Leetspeak.encode(scanner);
            case 51 -> new OOPTask51.Calculator().calc(scanner);
            default -> {
                System.out.println("Error, wrong answer, put number from 48 to 51");
                chooseTask(scanner);
            }
        }
    }
}

