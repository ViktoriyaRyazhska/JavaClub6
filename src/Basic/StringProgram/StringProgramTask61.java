package StringProgram;

import java.util.Scanner;

public class StringProgramTask61 {
    public static String fakeBin() {
        System.out.println("Fake Binary");

        System.out.println("Enter string with digits any digit below 5 with '0' and any digit 5 and above with '1'.");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println("Result is: " + str.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1"));

        return str.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

}
