package Basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask9 {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");

        assertEquals(-1, Task9.makeNegative(1));
        assertEquals(-9, Task9.makeNegative(9));
        assertEquals(-3, Task9.makeNegative(-3));
        assertEquals(0, Task9.makeNegative(0));

    }
}