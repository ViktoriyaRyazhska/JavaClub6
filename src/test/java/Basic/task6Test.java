package Basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task6Test {
    Task6 t = new Task6();

    @Test
    public void testToBinary() {
        assertEquals(1, Task6.toBinary(1));
        assertEquals(10, Task6.toBinary(2));
        assertEquals(11, Task6.toBinary(3));
        assertEquals(101, Task6.toBinary(5));
    }
}
