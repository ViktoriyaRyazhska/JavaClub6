package Collections;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class task2Test {

    @Test
    public void tests() {

        assertEquals(Arrays.asList(1), Task2.CreateList(1));
        assertEquals(Arrays.asList(1, 2), Task2.CreateList(2));
        assertEquals(Arrays.asList(1, 2, 3), Task2.CreateList(3));
        assertEquals(Arrays.asList(1, 2, 3, 4), Task2.CreateList(4));
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), Task2.CreateList(5));
    }
}
