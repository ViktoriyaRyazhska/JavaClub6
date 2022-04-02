package main.Loop;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The size of the array: ");
        int size=scanner.nextInt();
        System.out.println("Enter numbers:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Result: "+grow(arr));
    }

    public static int grow(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++) {
            result *= x[i];
        }
        return result;
    }
}
