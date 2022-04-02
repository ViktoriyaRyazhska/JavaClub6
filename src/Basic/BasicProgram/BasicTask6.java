package BasicProgram;

import java.util.Scanner;

public class BasicTask6 {
    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
    public static void toBinary(Scanner scanner) {
        System.out.println("Given a non-negative integer n, write a function to_binary/ToBinary\n"+
                " which returns that number in a binary format.");
        System.out.print("Put tha data, n= ");
        int n=scanner.nextInt();
        System.out.println("result= "+ Integer.parseInt(Integer.toBinaryString(n)));

    }

}
