import java.util.Scanner;

public class BasicTask5 {
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jenny has written a function that returns a greeting for a user.\n"+
                "However, she's in love with Johnny, and would like to greet him slightly different.\n"+
                "She added a special case to her function, but she made a mistake.");
        System.out.print("Put tha data, name is ");
        String name=scanner.next();
        if(name.equals("Johnny")){
            System.out.println("Hello, my love!");
        } else System.out.println(String.format("Hello, %s!", name));
    }
}
