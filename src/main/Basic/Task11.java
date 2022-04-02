package main.Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

//https://www.codewars.com/kata/grasshopper-debug
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input fahrenheit: ");

        try{
            int fahrenheit   = scanner.nextInt();
            int celsius=(fahrenheit-32)*5/9;
            System.out.println("Temperature in Celsius: "+celsius);

        }catch (InputMismatchException e){
            e.printStackTrace();
        }





    }
}
