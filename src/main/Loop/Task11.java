package main.Loop;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dad years old: ");
        int dadYears= scanner.nextInt();
        System.out.print("Enter son years old: ");
        int sonYears=scanner.nextInt();
        System.out.println("Result method: "+ TwiceAsOld(dadYears,sonYears));
    }

    public static int TwiceAsOld(int dadYears, int sonYears){
        int twiceAsOld = dadYears - sonYears * 2;
        return twiceAsOld > 0 ? twiceAsOld : (-1) * twiceAsOld;
    }
}
