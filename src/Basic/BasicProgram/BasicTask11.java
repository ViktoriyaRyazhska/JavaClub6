package BasicProgram;

import java.util.Scanner;

public class BasicTask11 {
    public static String Grasshopper(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grasshopper! To convert fahrenheit to celsius.");
        System.out.print("Put amount of fahrenheit:");
        int temp = scanner.nextInt();

        double c = (temp - 32) * 5.0 / 9;

        if (c > 0) {
            System.out.println(c + " is above freezing temperature");
            return String.format("%s is above freezing temperature", c);
        } else {
            System.out.println(c + " is freezing temperature");
            return String.format("%s is freezing temperature", c);
        }
    }
}
