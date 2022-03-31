package Basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class task10Test {
    @Test
    public void exampleTests() {
        assertEquals("15-20", Test10.datingRange(17));
        assertEquals("27-66", Test10.datingRange(40));
        assertEquals("14-16", Test10.datingRange(15));
        assertEquals("24-56", Test10.datingRange(35));
        assertEquals("9-11", Test10.datingRange(10));
    }
}
