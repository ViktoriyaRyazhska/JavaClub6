package Collections;

import java.util.Iterator;
import java.util.List;

public class Task3 {
//    https://www.codewars.com/kata/filtering-even-numbers-bug-fixes/

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        final Iterator<Integer> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()) {
            final Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        return listOfNumbers;
    }

}
