package BasicPrograms;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Task3Test {
    @Test
    public void testGetVolumeOfCuboid(){
        assertEquals(Task3.getVolumeOfCuboid(4,5,6),120);
        assertEquals(Task3.getVolumeOfCuboid(9,5,6),270);
    }

}