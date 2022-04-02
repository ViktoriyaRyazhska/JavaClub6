package Collections;

import java.util.List;
import java.util.ArrayList;

public class task1 {
    public static List<String> added() {
        List<String> items = new ArrayList<>();
        items.add("an object");
        return items;
    }

    public static void main(String[] args) {
        System.out.println(added());
    }
}
