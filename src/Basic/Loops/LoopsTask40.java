//Get the mean of an array
//https://www.codewars.com/kata/get-the-mean-of-an-array
//Author:Maksim Dziurei


package Loops;

import java.util.Scanner;

public class LoopsTask40 {
    public static int ReduceButGrow(){
        System.out.println("Given a non-empty array of integers, return the result of multiplying the values together in order.");
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.print("Enter length of array: ");
        ch= sc.nextInt();
        int[] marks=new int[ch];

        System.out.print("Enter nums: ");
        for(int i =0;i<marks.length;i++){
            marks[i]= sc.nextInt();
        }
        int j=1;
        for(int i=0;i<marks.length;i++){
            j *= marks[i];
        }
        System.out.println("Result: "+ j);
        return j;
    }
}
