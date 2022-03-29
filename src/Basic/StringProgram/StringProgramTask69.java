package StringProgram;

import java.util.Scanner;

public class StringProgramTask69 {
    public static String remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Remove n exclamation marks in the sentence from left to right. n is positive integer.");
        System.out.print("Write a sentences witch include exclamation ");
        String s = scanner.nextLine();
        System.out.print("How many exclamations should be remove? - ");
        int n = scanner.nextInt();
        for (int j = 0; j < n; j++)
            s = s.replaceFirst("!", "");
        System.out.println(s);
        return s;
    }
}
