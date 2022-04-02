package Loops;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

public class Task6Test {
    Task6 sequence = new Task6();
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, sequence.reverse(5));
    }
}
