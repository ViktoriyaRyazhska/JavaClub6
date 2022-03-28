package StringProgram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringProgramTask54 {
    public static String sayHello(){
        Scanner scanner =new Scanner(System.in);
        System.out.print( "String [] name =  ");
        String [] name=new String[2];
        name[0]=scanner.nextLine();
        System.out.print("city ");
        String city=scanner.nextLine();
        System.out.print("state ");
        String state=scanner.nextLine();
        System.out.println("Hello, "+name[0] +"! Welcome to "+city +", " +state+ "!");
        return "Hello, "+name[0]+" "+ "! Welcome to "+city +", " +state+ "!";
    }
}
