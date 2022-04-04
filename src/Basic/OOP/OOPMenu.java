package OOP;

import java.util.Scanner;

public class OOPMenu {
    public static void chooseTask(Scanner scanner) {
        System.out.println("Choose the number of tasks from 48 to 51:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 48:
                break;
            case 49:
                System.out.println("We are so sorry, but this task currently doesn't work\n"+
        "Please choose another one");
                break;
            case 50:
                OOPTask50.Leetspeak.encode(scanner);
                break;
            case 51:
                 new OOPTask51.Calculator().calc(scanner);
                break;
        }
    }
}

