//Is n divisible by x and y?
//https://www.codewars.com/kata/is-n-divisible-by-x-and-y
//Author:Maksim Dziurei

package Conditions;


import java.util.Scanner;

public class ConditionsTask20 {
    public static boolean divisible(){
        int n,x,y;
        boolean res;
        Scanner sc =new Scanner(System.in);
        System.out.println("Is n divisible by x and y?");
        System.out.print("Enter n:");
        n =sc.nextInt();
        System.out.print("Enter x:");
        x =sc.nextInt();
        System.out.print("Enter y:");
        y =sc.nextInt();
        if(n%x==0&&n%y==0)
            res=true;
        else res= false;
        System.out.println(res);
        return res;
    }
}
