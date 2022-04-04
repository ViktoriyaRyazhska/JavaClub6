package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask62 {

    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", Task62.weatherInfo(50));
    }
    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", Task62.weatherInfo(23));
    }
}