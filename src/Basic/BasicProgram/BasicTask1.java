package BasicProgram;

import java.util.Scanner;

public class BasicTask1 {
    public static int doubleInteger(int i) {
        int result=i*i;
        return result;

    }
    public static void doubleInteger(Scanner scanner){
        System.out.println("Code as fast as you can! You need to double the integer and return it.");
        System.out.print("Put the data, i= ");
        int i=scanner.nextInt();
        int result=i*i;
        System.out.println( "double="+result);
    }
}
