package Conditions;

import java.util.Scanner;

public class ConditionsTask31 {
    public static String updateLight() {

        System.out.println("Thinkful - Logic Drills: Traffic light.");
        System.out.println("Write current traffic light color: ");
        Scanner sc = new Scanner(System.in);
        String current = sc.next();

        switch (current) {
            case "red" -> {
                System.out.println("Light should change to green");
                return "green";
            }
            case "yellow" -> {
                System.out.println("Light should change to red");
                return "red";
            }
            case "green" -> {
                System.out.println("Light should change to yellow");
                return "yellow";
            }
            default -> throw new IllegalArgumentException();
        }
    }
}
