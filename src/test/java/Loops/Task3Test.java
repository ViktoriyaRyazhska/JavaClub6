package Loops;
/**     Task 3
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void testGetAverage() {
        assertEquals(3, Task3.getAverage(new int[]{0,0,9}));
        assertEquals(2, Task3.getAverage(new int[]{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}));
        assertEquals(4, Task3.getAverage(new int[]{2,6}));

    }
}