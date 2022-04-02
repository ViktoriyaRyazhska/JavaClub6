package main.Basic;

//Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number- ");
        int number=scanner.nextInt();
        System.out.println("To Binary: "+ToBinary(534));

    }
    public  static String ToBinary(int a){
        return Integer.toBinaryString(a);
    }

}
