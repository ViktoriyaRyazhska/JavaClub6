package Loop;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Boolean> sheeps = new ArrayList<>();
        sheeps.add(true);
        sheeps.add(true);
        sheeps.add(false);
        sheeps.add(true);
        sheeps.add(false);
        sheeps.add(null);
        sheeps.add(true);
        sheeps.add(false);
        sheeps.add(true);
        System.out.println(CountSheeps(sheeps));
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
