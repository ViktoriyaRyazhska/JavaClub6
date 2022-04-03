package main.Strings;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String  name= scanner.next();
        System.out.println(BanjoPlay(name));
    }

    public static String BanjoPlay(String name) {
        if (name.startsWith("R") || name.startsWith("r")) {
            return (name + " plays banjo");
        } else return (name + " does not play banjo");
    }
}