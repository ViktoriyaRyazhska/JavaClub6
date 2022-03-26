package Loops;

import java.util.Scanner;

public class LoopsTask44 {
    public static void findNearestSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.");
        System.out.print("Put your positive number=");
        int num=scanner.nextInt();
// find the square root
        if (num>0){
        int num1 = (int) Math.sqrt(num);
// if square root square’s is num… given number is a Perfect Square return the same //number
        if (num1 * num1 == num)
            System.out.println(num);
        else {
// else calculate floor_square and ceil_square get absolute difference between num
// which is minimum that is the nearest square num
            int floorSquare = num1 * num1;
            int ceilingSquare = (num1 + 1) * (num1 + 1);
            if (Math.abs(floorSquare - num) < Math.abs(ceilingSquare - num))
                System.out.println(floorSquare);
            else
                System.out.println(ceilingSquare);
        }
        } else System.out.println("You put wrong number");
    }
}
