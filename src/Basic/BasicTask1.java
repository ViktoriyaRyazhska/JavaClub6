import java.util.Scanner;

public class BasicTask1 {
    public static int doubleInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("            ---WELCOME---");
        System.out.println("Code as fast as you can! You need to double the integer and return it.");
        System.out.print("Put the data, i= ");
        int putData = scanner.nextInt();
        int result=putData*putData;
        System.out.println(result);
        return result;

    }
}
