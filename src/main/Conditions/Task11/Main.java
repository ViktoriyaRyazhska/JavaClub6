package main.Conditions.Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int v1=scanner.nextInt();
        int v2 = sequence(v1);
        System.out.println("Result: "+v2);
    }
    public static int sequence(int n) {
        int array[] = new int[n];
        array[0] = 0;
        array[1] = 1;
        for(int i=2; i < n; i++){
            array[i] = (array[i-1] + array[i-2]) % 3;
        }
        return array[n-1];
    }
}
