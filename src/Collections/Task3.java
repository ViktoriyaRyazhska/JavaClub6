package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(DropEven(list));

    }

    public static List<Integer> DropEven(List<Integer> list) {
        List<Integer>newList=new ArrayList<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer iter = iterator.next();
            if (iter % 2 != 0) {
                newList.add(iter);
            }
        }

        return newList;
    }
}
