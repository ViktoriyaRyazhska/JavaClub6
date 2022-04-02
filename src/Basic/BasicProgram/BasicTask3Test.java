package BasicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask3Test {
    private static final double delta = 0.0001;

    @Test
    void getVolumeOfCuboid() {
        assertEquals(4, BasicTask3.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, BasicTask3.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}