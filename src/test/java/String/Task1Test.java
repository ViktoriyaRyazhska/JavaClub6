package String;
import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test {
    @Test
    public void testNumberToString() {
        assertEquals("67", Task1.numberToString(67));
        assertEquals("0", Task1.numberToString(0));
        assertTrue("Error", "69".equals(Task1.numberToString(69)));
    }
}
