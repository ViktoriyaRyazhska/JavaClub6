package Collections;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class Task3Test {
    List<Integer> listOne = new LinkedList<>(Arrays.asList(111, 2, 2, 2, 4, 3, 4, 5, 69, 7));
    List<Integer> expectedOne = new LinkedList<>(Arrays.asList(111, 3, 5, 69, 7));

    List<Integer> listTwo = new LinkedList<>(Arrays.asList(2, 2, 2, 2, 4, 0, 4));
    List<Integer> expectedTwo = new LinkedList<>(Arrays.asList());

    @Test
    public void testFilterOddNumber1() throws Exception {
        assertEquals(expectedOne, Task3.filterOddNumber(listOne));
    }

    @Test
    public void testFilterOddNumber2() {
        assertEquals(Arrays.toString(expectedTwo.toArray()), Arrays.toString(Task3.filterOddNumber(listTwo).toArray()));
    }
}
