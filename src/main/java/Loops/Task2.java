package Loops;

import java.util.Arrays;

public class Task2 {

    // // Cat Years
    // // 15 cat years for first year
    // // +9 cat years for second year
    // // +4 cat years for each year after that

    // // Dog Years
    // // 15 dog years for first year
    // // +9 dog years for second year
    // // +5 dog years for each year after that

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                catYears += 11;
                dogYears += 10;
            }
            if (i == 2) {
                catYears += 5;
                dogYears += 4;
            }

            catYears += 4;
            dogYears += 5;

        }
        return new int[] { humanYears, catYears, dogYears };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(0)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(-5)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));

    }
}
