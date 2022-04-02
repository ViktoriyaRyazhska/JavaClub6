package main.Conditions.Task5;

import java.util.Scanner;

public class AgeDiff {
    // https://www.codewars.com/kata/how-old-will-i-be-in-2099/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthday year: ");
        int birth = scanner.nextInt();
        System.out.print("Enter what year is now: ");
        int yearTo = scanner.nextInt();
        System.out.println(CalculateAge(birth,yearTo));
    }

    public static String CalculateAge(int birth, int yearTo) {
        int result = yearTo - birth;
        if (result == 0) {
            return "You were born this very year!";
        }
        if (result == 1) {
            return "You are 1 year old.";
        }
        if (result == -1) {
            return "You will be born in 1 year.";
        }
        if (result > 0) {
            return "You are " + result + " years old.";
        }
        return "You will be born in " + -result + " years.";
    }
}
