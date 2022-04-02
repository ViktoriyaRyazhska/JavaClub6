package BasicProgram;

import java.util.Scanner;

public class BasicProgramMenu {
    public static void chooseTask(Scanner scanner) {
        System.out.println("Choose the number of tasks from 1 to 11:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 1:
                BasicTask1.doubleInteger(scanner);
                break;
            case 2:
                BasicTask2.multiply(scanner);
                break;
            case 3:
                BasicTask3.getVolumeOfCuboid(scanner);
                break;
            case 4:
                BasicTask4.isDivisible(scanner);
                break;
            case 5:
                BasicTask5.greet(scanner);
                break;
            case 6:
                BasicTask6.toBinary(scanner);
                break;
            case 7:
                BasicTask7.Past(scanner);
                break;
            case 8:
                BasicTask8.century(scanner);
                break;
            case 9:
                BasicTask9.makeNegative(scanner);
                break;
            case 10:
                BasicTask10.datingRange(scanner);
                break;
            case 11:
                BasicTask11.weatherInfo(scanner);
                break;
        }
    }


}