package main.Conditions.Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("How many days your vacation will be: ");
        int days=scanner.nextInt();
        System.out.println("Rent a car for "+days+" days will cost "+TotalAmount(days)+" dollars");

    }
    public static int TotalAmount(int days){
        if(days>=7){
            return days*40-50;
        }else if (days>=3){
            return days*40-20;
        }
        else return days*40;
    }
}
