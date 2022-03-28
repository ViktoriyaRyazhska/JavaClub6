package StringProgram;

import java.util.Scanner;

public class StringProgramTask64 {
    public static String abbrevName() {
        Scanner scanner =new Scanner(System.in);
        System.out.println(" Write a function to convert a name into initials.\n"+
                " This kata strictly takes two words with one space in between them.\n"+
                "The output should be two capital letters with a dot separating them.\n");
        System.out.print ("Put name ");
        String name=scanner.nextLine();
        name = name.toUpperCase();

        String [] names = name.split(" ");
        System.out.println(names[0].charAt(0)+"."+names[1].charAt(0));
        return names[0].charAt(0)+"."+names[1].charAt(0);
    }
}
