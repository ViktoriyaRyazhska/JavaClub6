package main.Loop;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String[] animal = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Random write 'tail body head': ");
        animal[0] = scanner.next();
        animal[1] = scanner.next();
        animal[2] = scanner.next();
        System.out.println(String.join(", ", ReArrangeArray(animal)));
    }

    public static String[] ReArrangeArray(String[] arr) {
        for (int i = 0; i < 3; i++) {
            if (i == 0 && arr[i] != "head") {
                arr[i] = "head";

            } else if (i == 1 && arr[i] != "body") {
                arr[i]= "body";
            } else if (i == 2 && arr[i] != "tail") {

                arr[i]= "tail";
            }
        }
        return arr;
    }
}