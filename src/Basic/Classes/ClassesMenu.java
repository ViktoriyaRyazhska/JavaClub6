package Classes;

import java.util.Scanner;

public class ClassesMenu {
    public static void chooseTask(Scanner scanner) {

        System.out.println("Choose the number of tasks from 12 to 17:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 12: new ClassesTask12();
                break;
            case 13:
                break;
            case 14:
                ClassMenuTask14main.resTask14(scanner);
                break;
            case 15:
                new ClassTask15.Canvas(7,7).draw(1,1,5,4).drawCanvas();
                break;
            case 16:
                ClassTask16.declareWinner(scanner);
                break;
            case 17:
                break;
        }
    }
}
