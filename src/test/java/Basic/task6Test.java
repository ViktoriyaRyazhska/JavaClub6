package Basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class task6Test {
    Test6 t = new Test6();

    @Test
    public void testToBinary() {
        assertEquals(1, t.toBinary(1));
        assertEquals(10, t.toBinary(2));
        assertEquals(11, t.toBinary(3));
        assertEquals(101, t.toBinary(5));
    }
}
