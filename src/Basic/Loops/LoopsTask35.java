//Get the mean of an array
//https://www.codewars.com/kata/get-the-mean-of-an-array
//Author:Maksim Dziurei


package Loops;

import java.util.Scanner;

public class LoopsTask35 {


    public static int getAverage(int[] marks){
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return sum / marks.length;
    }
    public static int getAverage(Scanner sc){
        int sum=0;
        int c=0;
        System.out.println("It's the academic year's end, fateful moment of your school report.\n The averages must be calculated.\n All the students come to you and entreat you to calculate their average for them.");

        System.out.print("How many students? ");
        c=sc.nextInt();
        int [] marks = new int[c];
        for(int i=0;i<c;i++){
        marks[i] = sc.nextInt();
        }
        for (int mark : marks) {
            sum += mark;
        }
        System.out.println("Result: "+sum / marks.length);
        return sum / marks.length;


    }
}
