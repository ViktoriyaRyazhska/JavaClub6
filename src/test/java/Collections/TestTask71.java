package Collections;

import org.junit.Test;
import java.util.List;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class TestTask71 {
    @Test
    public void firstTest() throws Exception {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList(1, 2, 2, 2, 4, 3, 4, 5, 6, 7));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        assertEquals(expectedResult,Task71.filterOddNumber(listOfNumbers));
    }

    @Test
    public void secondTest() {
        List<Integer> listOfNumbers = new LinkedList<>(Arrays.asList( 1, 2, 2, 2, 4, 3, 4 ));
        List<Integer> expectedResult = new LinkedList<>(Arrays.asList( 1, 3 ));
        assertEquals(Arrays.toString(expectedResult.toArray()), Arrays.toString(Task71.filterOddNumber(listOfNumbers).toArray()));
    }
}
