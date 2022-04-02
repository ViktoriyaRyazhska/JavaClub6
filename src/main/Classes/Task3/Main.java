package main.Classes.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("enter first numerator: ");
        int firstNumerator = scanner1.nextInt();
        System.out.println("enter first denominator: ");
        int firstDenominator = scanner1.nextInt();
        System.out.println("enter second numerator: ");
        int secondNumerator = scanner1.nextInt();
        System.out.println("enter second denominator: ");
        int secondDenominator = scanner1.nextInt();
        Fraction fraction1 = new Fraction(firstNumerator, firstDenominator);
        Fraction fraction2 = new Fraction(secondNumerator, secondDenominator);
        System.out.println("Result: "+fraction1.add(fraction2).toString());
    }
}
