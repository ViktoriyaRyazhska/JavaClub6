package Classes;

import Main.Main;
import static Main.FirstHelloMenu.sorryMessage;
import java.util.Scanner;

public class ClassesMenu {
    public static void chooseTask(Scanner scanner) {

        System.out.println("Choose the number of tasks from 12 to 17:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 12 -> new ClassTask12().result();
            case 13 -> ClassTask13.INST.plus100(scanner);
            case 14 -> ClassTask14main.resTask14(scanner);
            case 15 -> ClassTask15main.resTask15(scanner);
            case 16 -> ClassTask16.declareWinner(scanner);
            case 17 -> sorryMessage(17);
            default -> {
                System.out.println(Main.RED_UNDERLINED + "Error, wrong answer" + Main.ANSI_RESET);
                chooseTask(scanner);
            }
        }
    }
}
