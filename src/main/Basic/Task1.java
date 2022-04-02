package main.Basic;

// Need to double integer

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number to Double: ");
        int number = scanner.nextInt();
        System.out.println("Result: "+Double(number));
    }
    public static int Double(int a){
        return a*2;
    }
}
