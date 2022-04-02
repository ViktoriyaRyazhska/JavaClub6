package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTask51 {
    @Test
    public void tests() {
        assertEquals("67", Task51.numberToString(67));
        assertEquals("123", Task51.numberToString(123));
        assertEquals("999", Task51.numberToString(999));
    }
}