package main.Strings;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your full name ");
        String nameToBeConverted = scanner.nextLine();
        System.out.println("Result is:");
        System.out.println(Task13.abbrevName(nameToBeConverted));
    }
    public static String abbrevName(String name) {
        name = name.toUpperCase();
        String[] names = name.split(" ");
        return names[0].charAt(0)+"."+names[1].charAt(0);
    }
}
