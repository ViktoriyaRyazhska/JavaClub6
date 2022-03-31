package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task12Test {
    @Test
    public void tests1() {
        assertEquals("10.0 is above freezing temperature", Task12.weatherInfo(50));
    }

    @Test
    public void tests2() {
        assertEquals("-5.0 is freezing temperature", Task12.weatherInfo(23));
    }

}
