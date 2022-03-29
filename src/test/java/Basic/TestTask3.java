package Basic;

import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestTask3 {
    private static final double delta = 0.0001;
    @Test
    public void examples() {
        // assertEquals("expected", "actual");

        assertEquals(4, Task3.getVolumeOfCuboid(1,2,2), delta);
        assertEquals(63, Task3.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}

