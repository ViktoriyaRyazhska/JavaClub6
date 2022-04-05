package BasicProgram;

import java.util.Scanner;

public class BasicTask1 {
    public static int doubleInteger(int i) {
        return i*i;

    }
    public static void doubleInteger(Scanner scanner){
        System.out.println("Code as fast as you can! You need to double the integer and return it.");
        System.out.print("Put the data, i= ");
        int i=scanner.nextInt();
        int result=i*i;
        System.out.println( "double="+result);
    }
}
