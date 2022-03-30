//Beginner - Reduce but Grow
//https://www.codewars.com/kata/beginner-reduce-but-grow
//Author:Maksim Dziurei


package Loops;

import java.util.Scanner;

public class LoopsTask45 {
    public static int getAverage(){
        System.out.println("It's the academic year's end, fateful moment of your school report.");
        System.out.println("The averages must be calculated.");
        System.out.println("All the students come to you and entreat you to calculate their average for them.");
        System.out.println("Easy!");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int ch= sc.nextInt();
        int[] marks = new int[ch];
        System.out.print("Enter nums: ");
        for(int i =0;i<marks.length;i++){
            marks[i]= sc.nextInt();
        }
        int sum= 0;
        for (int i : marks){
            sum+= i;
        }
        System.out.println("Result: "+sum/marks.length);
        return sum/marks.length;

    }
}
