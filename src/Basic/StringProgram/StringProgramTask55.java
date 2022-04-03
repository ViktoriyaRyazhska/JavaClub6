//Opposite number
//https://www.codewars.com/kata/opposite-number/
//Author:Maksim Dziurei


package StringProgram;

import java.util.Scanner;

public class StringProgramTask55 {

    public static Integer oppositeNum(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Opposite number");
        System.out.print("Enter your number:");
        number = sc.nextInt();
        return -1*number;
    }
}
