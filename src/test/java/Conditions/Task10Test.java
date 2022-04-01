package Conditions;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Task10Test {
    @Test
    public void testBob() {
        assertEquals("Should return 4.", 4, Task10.enough(2, 1, 5));
        assertEquals("Should return 0.", 0, Task10.enough(100, 50, 50));
        assertEquals("Should return 0.", 0, Task10.enough(20, 5, 5));
    }
}
