package test.Collections;

import main.Collections.Task3;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3Test {
    @Test
    public void firstTest() throws Exception {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expectedResult,Task3.DropEven(listOfNumbers));
    }

    @Test
    public void secondTest() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Task3.DropEven(listOfNumbers).toArray()));
    }

    @Test
    public void thirdTest() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 1, 10, 15, 345, 6, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 1, 15, 345, 3 ));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Task3.DropEven(listOfNumbers).toArray()));
    }
}
