package Basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task3Test {
    private static final double delta = 0.0001;

    @Test
    public void volumeTest() {
        // assertEquals("expected", "actual");
        assertEquals(4, Task3.getVolumeOfCubiod(1, 2, 2), delta);
        assertEquals(63, Task3.getVolumeOfCubiod(6.3, 2, 5), delta);

        assertEquals(2, Task3.getVolumeOfCubiod(0.1, 20, 1), delta);
        assertEquals(21.111, Task3.getVolumeOfCubiod(2.1111, 2, 5), delta);
    }
}
