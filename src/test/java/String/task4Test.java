package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task4Test {
    @Test
    public void tests() {
        assertEquals(-1, Task4.opposite(1));
        assertEquals(1, Task4.opposite(-1));
        assertEquals(0, Task4.opposite(0));
    }

}
