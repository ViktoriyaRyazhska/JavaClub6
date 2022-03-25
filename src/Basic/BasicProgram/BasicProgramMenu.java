package BasicProgram;

import java.util.Scanner;

public class BasicProgramMenu {
    public static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the number of tasks from 1 to 11:");
        int chooseNumber = scanner.nextInt();
        switch (chooseNumber) {
            case 1:
                BasicTask1.doubleInteger();
                break;
            case 2:
                BasicTask2.multiply();
                break;
            case 3:
                BasicTask3.getVolumeOfCuboid();
                break;
            case 4:
                BasicTask4.isDivisible();
                break;
            case 5:
                BasicTask5.greet();
                break;
            case 6:
                BasicTask6.toBinary();
                break;
            case 7:
                BasicTask7.Past();
                break;
            case 8:
                BasicTask8.century();
                break;
            case 9:
                BasicTask9.makeNegative();
                break;
            case 10:
                BasicTask10.ageCounter();
                break;
        }
    }


}