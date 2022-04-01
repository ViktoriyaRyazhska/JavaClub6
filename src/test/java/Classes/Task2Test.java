package Classes;

/**     Task 2
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void testplus100() {
        assertEquals(101, Task2.INST.plus100(1));
        assertEquals(200, Task2.INST.plus100(100));
        assertEquals(223, Task2.INST.plus100(123));
        assertEquals(512, Task2.INST.plus100(412));
        assertEquals(0, Task2.INST.plus100(-100));
    }
}