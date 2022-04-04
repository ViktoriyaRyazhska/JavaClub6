package Loops;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsTask41 {
    public static int sum(Scanner scanner){

        System.out.println("Sum of positive");
        System.out.println("You get an array of numbers, return the sum of all of the positives ones.");

        System.out.println("\nEnter the amount of numbers in the array?");
        int num = scanner.nextInt();

        int[] array = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0 ; i < array.length; i++ ) {
            array[i] = scanner.nextInt();
        }

        System.out.println("List is " + Arrays.toString(array));

        int result = 0;
        for (int i : array) {
            if (i > 0) {
                result += i;
            }
        }

        System.out.println("\nThe result sum is: " + result);

        return result;
    }

    public static int sum(int[] arr){
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }

        return result;
    }
}
