package Collections;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>();

        for (int count = 1; count <= number; ++count) {
            list.add(count);
        }

        return list;
    }
}
