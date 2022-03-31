package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task16Test {
    @Test
    public void tests() {
        assertEquals("SSS", Task16.correct("555"));
        assertEquals("SOS", Task16.correct("505"));
        assertEquals("I2I", Task16.correct("121"));
    }
}
