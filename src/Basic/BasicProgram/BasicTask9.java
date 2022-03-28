package BasicProgram;

import java.util.Scanner;

public class BasicTask9 {
    public static int makeNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In this simple assignment you are given a number and have to make it negative.\n" +
                " But maybe the number is already negative?");
        System.out.print("Put the number= ");
        final int x = scanner.nextInt();
        if (x < 0) {
            System.out.println(x);
            return x;
        } else {
            System.out.println(x * (-1));
            return x * (-1);
        }
    }

}
