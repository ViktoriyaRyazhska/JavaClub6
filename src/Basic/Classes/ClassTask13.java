package Classes;

import java.util.Scanner;

public class ClassTask13 {
    public static ClassTask13 INST = new ClassTask13();

    private static int ONE_HUNDRED = 100;

    private static int value;

    static{
        value = 100;
    }

    private ClassTask13() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
    public void plus100(Scanner scanner){
        System.out.println("The code provided has a method plus100 which is supposed to return the number of the parameter incremented by 100.");
        System.out.print("Put n= ");
        int n=scanner.nextInt();
        System.out.println("result= "+value+n);
    }
}
