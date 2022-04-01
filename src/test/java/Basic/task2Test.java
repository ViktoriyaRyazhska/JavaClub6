package Basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task2Test {
    Task2 t = new Task2();

    @Test
    public void sampleTest() {
        assertEquals(4, t.multiply(2, 2));
        assertEquals(10, t.multiply(5, 2));
        assertEquals(100, t.multiply(100, 1));
        assertEquals(0, t.multiply(0, 1000));
    }
}
