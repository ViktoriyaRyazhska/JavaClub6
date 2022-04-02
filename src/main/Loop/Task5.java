package main.Loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sheeps:");

        List<Boolean> sheeps = new ArrayList<>();
        boolean b = true;
        do {
            String str = scanner.next();
            if (str.equals("exit")) {
                b = false;
            } else {

                boolean isShip = str.equals("1");
                sheeps.add(isShip);
            }

        } while (b);
        System.out.println("Number of sheeps: "+CountSheeps(sheeps));
    }

    public static int CountSheeps(List<Boolean> sheeps) {
        int counter = 0;
        try {
            for (Boolean sheep : sheeps
            ) {
                if (sheep != null && sheep) {
                    counter++;
                }
            }


        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }


        return counter;
    }
}
