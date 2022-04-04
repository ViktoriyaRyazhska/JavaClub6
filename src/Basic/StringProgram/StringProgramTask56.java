package StringProgram;

import java.util.Scanner;

public class StringProgramTask56 {
    public static String replaceDots() {
        System.out.println("FIXME: Replace all dots");

        System.out.println("Enter some sentence with [.] its will be replaced with [-]");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println("Result is: " + str.replace(".", "-"));

        return str.replace(".", "-");
    }
    public static String replaceDots(final String str){
        return str.replace(".", "-");
    }

}
