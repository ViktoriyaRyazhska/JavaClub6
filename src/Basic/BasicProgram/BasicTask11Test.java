package BasicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask11Test {

    @Test
    public void testA() {
        assertEquals("10.0 is above freezing temperature", BasicTask11.weatherInfo(50));
    }

    @Test
    public void testB() {
        assertEquals("-5.0 is freezing temperature", BasicTask11.weatherInfo(23));

    }
}