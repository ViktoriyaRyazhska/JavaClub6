package main.Loop;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    // https://www.codewars.com/kata/reversed-sequence/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(reverse(n)));
    }

    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n--;
        }
        return arr;
    }
}
