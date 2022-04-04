package Conditions;

import java.util.Scanner;

public class ConditionsTask26 {
    public static boolean isLove() {

        System.out.println("Opposites Attract.");
        System.out.println("Write amount of petals in first flower: ");
        Scanner sc = new Scanner(System.in);
        int flower1 = sc.nextInt();

        System.out.println("Write amount of petals in second flower: ");
        int flower2 = sc.nextInt();

        boolean answer = flower1 % 2 != flower2 % 2;

        System.out.println("The answer is: " + answer);

        return answer;
    }

    public static boolean isLove(final int flower1, final int flower2) {
        boolean answer = flower1 % 2 != flower2 % 2;
        return answer;
    }
}
