//Basic Mathematical Operations
//https://www.codewars.com/kata/basic-mathematical-operations
//Author:Maksim Dziurei

package Conditions;

import java.util.Scanner;

public class ConditionsTask25 {
    public static Integer basicOperations(){
        Scanner sc = new Scanner(System.in);
        String op;
        int a,b;
        System.out.println("Is n divisible by x and y?");
        System.out.print("Enter operator:");
        op=sc.nextLine();
        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b=sc.nextInt();
        if (op.equals("+")){
            System.out.println("Result"+(a+b));
            return a+b;}
        if (op.equals("-")){
            System.out.println("Result"+(a-b));
            return a-b;}
        if (op.equals("*")){
            System.out.println("Result"+(a*b));
            return a*b;}
        else if (op.equals("/")){
            System.out.println("Result"+(a/b));
            return a/b;}
        return null;
    }
}
