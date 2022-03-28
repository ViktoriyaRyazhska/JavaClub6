package StringProgram;

import java.util.Scanner;

public class StringProgramTask54 {
    public static String sayHello(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Create a method sayHello/say_hello/SayHello that takes as input a name,\n"+
                " city, and state to welcome a person. Note that name will be an array \n"+
                "consisting of one or more values that should be joined together with one\n"+
                " space between each, and the length of the name array in test cases will vary.\n");
        System.out.print( "String [] name is ");
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
