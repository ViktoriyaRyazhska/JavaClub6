package main.Strings;

import java.util.Scanner;

public class Task17 {
    // https://www.codewars.com/kata/alternating-case-<-equals->-alternating-case/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String  str= scanner.nextLine();
        System.out.println("Result: "+toAlternativeString(str));
    }
    public static String toAlternativeString(String string) {
        StringBuilder sb = new StringBuilder();
        for (char a : string.toCharArray()) {
            if (Character.isUpperCase(a)) {
                sb.append(Character.toLowerCase(a));
            } else {
                sb.append(Character.toUpperCase(a));
            }
        }
        return sb.toString();
    }
}
