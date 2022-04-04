package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsTask36 {
    public static int[] map() {

        System.out.println("Beginner - Lost Without a Map.");
        System.out.println("Given an array of integers, return a new array with each value doubled.");

        System.out.println("\nHow many numbers do you want to enter?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < arr.length; i++ ) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("List is " + Arrays.toString(arr));

        System.out.print("Result is: "
                + Arrays.toString(Arrays.stream(arr).map(s -> s * 2).toArray()));

        return Arrays.stream(arr)
                .map(s -> s*2)
                .toArray();
    }
    public static int[] map(int[] arr) {
        return Arrays.stream(arr)
                .map(s -> s*2)
                .toArray();
    }
}
