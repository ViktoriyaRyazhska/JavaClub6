package BasicProgram;

import java.util.Scanner;

public class BasicTask2 {
    public static int multiply(int num1, int num2) {
        return num1*num2;
    }
    public static void  multiply(Scanner scanner){
        System.out.println("Implement a function which multiplies two numbers.");
        System.out.print("Put the data,num1= " );
        int num1=scanner.nextInt();
        System.out.print("num2= ");
        int num2=scanner.nextInt();
        System.out.println("result= "+num1*num2);
    }

}
