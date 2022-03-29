package StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class StringProgramTask66 {
    public static String twoSort() {

        System.out.println("Sort and Star");
        System.out.println("After entering some words they will be alphabetically sorted " +
                "\nand then the first word will output with \"***\" between each of its letters.");

        System.out.print("\nHow many word do you want to enter: ");

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();

        String[] str = new String[m];

        for(int i = 0; i < m; i++)
        {
            System.out.print("\nEnter word " + (i + 1) + ": ");
            String s = sc.nextLine();
            str[i]=s;
        }

        System.out.println("\nWords entered: " + Arrays.toString(str));

        java.util.Arrays.sort(str);

        String result = String.join("***", str[0].split(""));

        System.out.println("Result is: " + result);

        return result;
    }
}
