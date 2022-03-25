package BasicProgram;

import java.util.Scanner;

public class BasicTask8 {

    public static void century() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given a year, return the century it is in.");
        System.out.print("Given year is ");
        int number=scanner.nextInt();
        if (number%100!=0){
            System.out.println((int) number/100+1);
        }
        else System.out.println((int) (number/100));
    }

}
