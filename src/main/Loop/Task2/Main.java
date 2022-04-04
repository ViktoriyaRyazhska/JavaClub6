package main.Loop.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter human years: ");
        int years = in.nextInt();
        System.out.println("Cat years: " + Task2.humanYearsCatYearsDogYears(years)[1]);
        System.out.println("Dog years: " + Task2.humanYearsCatYearsDogYears(years)[2]);
    }

}
