package Collections;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestTask70 {

    @Test
    void createList() {
        assertEquals(Arrays.asList(1), Task70.CreateList(1));
        assertEquals(Arrays.asList(1,2), Task70.CreateList(2));
        assertEquals(Arrays.asList(1,2,3), Task70.CreateList(3));
        assertEquals(Arrays.asList(1,2,3,4), Task70.CreateList(4));
        assertEquals(Arrays.asList(1,2,3,4,5), Task70.CreateList(5));
    }

}