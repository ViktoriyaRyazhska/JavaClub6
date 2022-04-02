package BasicProgram;

import java.util.Scanner;

public class BasicTask8 {
    public static int century(int number) {
        if (number % 100 != 0) {
            return (int) number / 100 + 1;
        } else return (int) (number / 100);
    }

    public static void century(Scanner scanner) {
        System.out.println("Given a year, return the century it is in.");
        System.out.print("Given year is ");
        int number = scanner.nextInt();
        if (number % 100 != 0) {
            System.out.println((int) number / 100 + 1);
        } else System.out.println((int) (number / 100));

    }

}
