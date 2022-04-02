package main.Basic;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=scanner.nextInt();
        System.out.println("Your negative number: "+makeNegative(number));}
    public static int makeNegative(final int x) {
        return x < 0 ? x : -x;
    }
}
