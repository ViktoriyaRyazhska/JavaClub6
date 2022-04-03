package main.Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

//https://www.codewars.com/kata/grasshopper-debug
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input fahrenheit: ");

        try {
            int fahrenheit = scanner.nextInt();
            int celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);

        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0) {
            return (c + " is above freezing temperature");
        } else {
            return (c + " is freezing temperature");
        }
    }

    public static double convertToCelsius(int temperature) {
        return (temperature - 32) * 5 / 9.0;
    }
}
