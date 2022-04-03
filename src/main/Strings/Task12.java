package main.Strings;

import java.util.Scanner;

public class Task12 {
    // https://www.codewars.com/kata/grasshopper-debug/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        int temp= scanner.nextInt();
        System.out.println("Temperature in celsius: "+convertToCelsius(temp));
        System.out.println(weatherInfo(temp));
    }
    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        double celsius = ((temperature - 32) * 5 / 9.0);
        return celsius;
    }
}
