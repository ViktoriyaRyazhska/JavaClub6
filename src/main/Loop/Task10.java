package main.Loop;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> animal = new ArrayList<>();
        animal.add("tail");
        animal.add("body");
        animal.add("head");
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
