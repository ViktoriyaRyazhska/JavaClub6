package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task6Test {
    task6 b = new task6(new int[]{2,2,2});
    @Test
    public void testBasicBlock() throws Exception {
        assertEquals(2,b.getWidth());
        assertEquals(2,b.getLength());
        assertEquals(2,b.getHeight());
        assertEquals(8,b.getVolume());
        assertEquals(24,b.getSurfaceArea());
    }
}
