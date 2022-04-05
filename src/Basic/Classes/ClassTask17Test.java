package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ClassTask17Test {
    @Test
    public void testBasicBlock() throws Exception {
    ClassTask17 b = new ClassTask17(new int[]{2,2,2});
    assertEquals(2,b.getWidth());
    assertEquals(2,b.getLength());
    assertEquals(2,b.getHeight());
    assertEquals(8,b.getVolume());
    assertEquals(24,b.getSurfaceArea());
}

}