package main.OOP.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String str = scanner.next();
        Leetspeak leetspeak = new Leetspeak();
        System.out.println(leetspeak.encode(str));
    }
}
