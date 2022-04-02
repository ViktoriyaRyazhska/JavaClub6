package Conditions;
/**     Task 10
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    public void testEnough() {
        assertEquals(12, Task10.enough(100,10,102));
        assertEquals(1, Task10.enough(23,13,11));
        assertEquals(9, Task10.enough(10,1,18));
        assertEquals(0, Task10.enough(100,1,12));
        assertEquals(0, Task10.enough(1,1,0));
    }
}