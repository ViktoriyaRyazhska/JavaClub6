package BasicProgram;

import java.util.Scanner;

public class BasicTask7 {
    public static int Past(int h, int m, int s) {
        return h * 60 * 60 * 1000 + m * 60 * 1000 + s * 1000;
    }

    public static void Past(Scanner scanner) {
        System.out.println("To write a function which returns the time since midnight in milliseconds.");
        System.out.print("Put the dats od hours= ");
        int h = scanner.nextInt();
        System.out.print("minutes= ");
        int m = scanner.nextInt();
        System.out.print("seconds");
        int s = scanner.nextInt();
        System.out.println("result in milliseconds is " + h * 60 * 60 * 1000 + m * 60 * 1000 + s * 1000);
    }


}
