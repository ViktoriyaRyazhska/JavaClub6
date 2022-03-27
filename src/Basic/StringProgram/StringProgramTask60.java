package StringProgram;

import java.util.Scanner;

public class StringProgramTask60 {
    public static String findThePosition(){
        char alphabet;
        String res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the position!");
        System.out.print("Enter your letterL: ");
        alphabet=sc.next().charAt(0);
        res="Position of alphabet: " + ((int) alphabet - 96);
        return res;
    }
}
