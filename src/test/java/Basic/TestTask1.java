package Basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask1 {
    private static final double delta = 0.0001;
    @Test
    public void examples() {
        // assertEquals("expected", "actual");

        assertEquals(1, Task1.doubleInteger(1), delta);
        assertEquals(24, Task1.doubleInteger(12), delta);
        assertEquals(0, Task1.doubleInteger(0), delta);

    }
}