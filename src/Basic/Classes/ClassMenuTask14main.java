package Classes;

import java.util.Scanner;

public class ClassMenuTask14main {
    public static void resTask14(Scanner scanner) {
        System.out.println("You are provided with a skeleton of the class 'Fraction',\n" +
                " which accepts two arguments (numerator, denominator).\n" +
                "Your task is to make this class string representable, and addable while\n" +
                " keeping the result in the minimum representation possible.");
        System.out.print("topFirst= ");
        long top = scanner.nextLong();
        System.out.print("bottomFirst= ");
        long bottom = scanner.nextLong();
        System.out.print("topSecond= ");
        long topNew = scanner.nextLong();
        System.out.print("bottomSecond= ");
        long bottomNew = scanner.nextLong();
        new ClassMenuTask14(top, bottom).add(new ClassMenuTask14(topNew, bottomNew));
    }
}
