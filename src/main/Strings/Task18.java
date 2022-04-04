package main.Strings;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to remove exclamation mark");
        String someString = scanner.next();
        System.out.println("Enter a number of exclamations");
        int num = scanner.nextInt();
        System.out.println("Result is:");
        System.out.println(Task18.removeExclamationMarks(someString,num));
    }
    public static String removeExclamationMarks(String string, int number){
        int i = 0;
        String result = "";
        while (i != string.length() - 1 && number != 0){
            if (string.charAt(i) == '!') {
                i++;
                number--;
                continue;
            }
            result += string.charAt(i);
            i++;
        }
        return result;
    }
}
