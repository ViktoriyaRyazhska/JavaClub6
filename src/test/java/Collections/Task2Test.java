package Collections;
/**     Task 2
 * @author wertylu*/
import java.util.Arrays;
import java.util.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void createList() {
        assertEquals(Arrays.asList(1,2,3,4), Task2.CreateList(4));
        assertEquals(Arrays.asList(1), Task2.CreateList(1));
        assertEquals(Arrays.asList(1,2,3), Task2.CreateList(3));
    }
}