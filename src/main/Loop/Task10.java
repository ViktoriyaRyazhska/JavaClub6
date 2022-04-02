package main.Loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Random write 'tail body head': ");
        animal.add(scanner.next());
        animal.add(scanner.next());
        animal.add(scanner.next());
        System.out.println(ReArrangeArray(animal));
    }

    public static List<String> ReArrangeArray(List<String> arr) {
        for (int i = 0; i < 3; i++) {
            if (i == 0 && arr.get(i) != "head") {
                arr.set(i, "head");

            } else if (i == 1 && arr.get(i) != "body") {
                arr.set(i, "body");
            } else if (i == 2 && arr.get(i) != "tail") {

                arr.set(i, "tail");
            }
        }
        return arr;
    }
}
