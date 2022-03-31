package Classes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTask17 {

    @Test
    public void testBasicBlock(){
        Task17 b = new Task17(new int[]{2,2,2});
        assertEquals(2,b.getWidth());
        assertEquals(2,b.getLength());
        assertEquals(2,b.getHeight());
        assertEquals(8,b.getVolume());
        assertEquals(24,b.getSurfaceArea());
    }
    @Test
    public void testBasicBlockZero() {
        Task17 b = new Task17(new int[]{2,2,0});
        assertEquals(2,b.getWidth());
        assertEquals(2,b.getLength());
        assertEquals(0,b.getHeight());
        assertEquals(0,b.getVolume());
        assertEquals(8,b.getSurfaceArea());
    }
}
