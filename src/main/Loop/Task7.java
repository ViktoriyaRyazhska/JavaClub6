package main.Loop;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Please enter number and class points: ");
        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
        System.out.print("Please enter your score: ");
        if (Task7.betterThanAverage(array, in.nextInt())){
            System.out.println("True, you're better than average.");
        } else {
            System.out.println("False, you're worse than average.");
        }
    }
    public static boolean betterThanAverage(int [] classPoints, int yourPoints){
        int amount = 0;
        boolean result = false;

        for (int i = 0; i<classPoints.length; i++){
            amount += classPoints[i];
        }

        if (yourPoints > amount/classPoints.length){
            result = true;
        }

        return result;
    }
}
