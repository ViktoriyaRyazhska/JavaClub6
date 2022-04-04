package main.Conditions.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int v1=scanner.nextInt();
       int v2= getOpposite(v1);

        System.out.println("Result: "+v2);
    }
    public static int getOpposite(int number){
        return number * (-1);
    }
}
