package Collections;

import java.util.List;
import java.util.stream.Collectors;

public class Task71 {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        return   listOfNumbers
                .stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
    }
}
