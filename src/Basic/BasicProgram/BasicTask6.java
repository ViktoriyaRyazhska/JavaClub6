package BasicProgram;

import java.util.Scanner;

public class BasicTask6 {
    public static void toBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Given a non-negative integer n, write a function to_binary/ToBinary\n"+
                " which returns that number in a binary format.");
        System.out.print("Put tha data, n= ");
        int n=scanner.nextInt();
        System.out.println("result= "+ Integer.parseInt(Integer.toBinaryString(n))); ;
    }

}
