package Basic;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Task11Test {
    @Test
    public void testConvertToCelsius() {
        assertEquals("10.0 is above freezing temperature", Task11.weatherInfo(50));
    }
    @Test
    public void testConvertToCelsius2() {
        assertEquals("-5.0 is freezing temperature", Task11.weatherInfo(23));
    }
    @Test
    public void testConvertToCelsius3() {
        assertEquals("9.4 is above freezing temperature", Task11.weatherInfo(49));
    }
}
