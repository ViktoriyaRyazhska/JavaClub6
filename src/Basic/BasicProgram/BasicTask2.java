package BasicProgram;

import java.util.Scanner;

public class BasicTask2 {
    public static int multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Implement a function which multiplies two numbers.");
        System.out.print("Put the data,num1= " );
        int num1=scanner.nextInt();
        System.out.print("num2= ");
        int num2=scanner.nextInt();
        System.out.println(num1*num2);
        return num1*num2;
    }

}
