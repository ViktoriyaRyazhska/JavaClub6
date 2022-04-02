package main.Conditions.Task10;

import java.util.Scanner;

public class Task10 {
    // https://www.codewars.com/kata/will-there-be-enough-space/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount of people the bus can hold: ");
        int cap=scanner.nextInt();
        System.out.print("Number of people on the bus: ");
        int on=scanner.nextInt();
        System.out.print("Number of people waiting to get on: ");
        int wait = scanner.nextInt();
        System.out.println("Can't take "+enough(cap, on, wait)+" passengers");

    }

    public static int enough(int cap, int on, int wait) {
        return cap >= wait + on ? 0 : wait + on - cap;
    }

}
