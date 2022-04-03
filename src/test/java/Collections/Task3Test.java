package Collections;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void testFilterOddNumberMethod() {
        List<Integer> listOfNumbers = new LinkedList<>(List.of(5,6,7,8,9,2,3,4));
        List<Integer> expectedListOfNumbers = new LinkedList<>(List.of(5,7,9,3));
        assertEquals(expectedListOfNumbers,Task3.filterOddNumber(listOfNumbers));
    }
}