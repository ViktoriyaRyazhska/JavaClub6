package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsTask34 {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int[] years = new int[3];
        years[0] = humanYears;
        int firstYear = 15;
        int secondYear = firstYear + 9;
        if (humanYears == 1) {
            years[1] = firstYear;
            years[2] = firstYear;
            System.out.print ("Respective ages are " + Arrays.toString(years));
            return new int[]{years[0],years[1],years[2]};
        } else if (humanYears == 2) {
            years[1] = secondYear;
            years[2] = secondYear;
            System.out.print("Respective ages are " + Arrays.toString(years));
            return new int[]{years[0],years[1],years[2]};
        } else if (humanYears > 2)
            years[1] = secondYear + (humanYears - 2) * 4;
        years[2] = secondYear + (humanYears - 2) * 5;
        System.out.print("Respective ages are " + Arrays.toString(years));
        return new int[]{years[0],years[1],years[2]};
    }
    public static int[] humanYearsCatYearsDogYears(Scanner scanner) {

        System.out.println("I have a cat and a dog.\n" +
                "I got them at the same time as kitten/puppy. That was humanYears years ago.\n" +
                "Return their respective ages now as [humanYears,catYears,dogYears]"+"\n");
        System.out.print("Put the number of humanYears= ");
        final int humanYears = scanner.nextInt();
        int[] years = new int[3];
        years[0] = humanYears;
        int firstYear = 15;
        int secondYear = firstYear + 9;
        if (humanYears == 1) {
            years[1] = firstYear;
            years[2] = firstYear;
            System.out.print ("Respective ages are " + Arrays.toString(years));
            return new int[]{years[0],years[1],years[2]};
        } else if (humanYears == 2) {
            years[1] = secondYear;
            years[2] = secondYear;
            System.out.print("Respective ages are " + Arrays.toString(years));
            return new int[]{years[0],years[1],years[2]};
        } else if (humanYears > 2)
            years[1] = secondYear + (humanYears - 2) * 4;
            years[2] = secondYear + (humanYears - 2) * 5;
            System.out.print("Respective ages are " + Arrays.toString(years));
            return new int[]{years[0],years[1],years[2]};
    }
}



