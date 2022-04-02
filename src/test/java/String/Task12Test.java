package String;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task12Test {
    @Test
    public void testWeatherInfoAboveFreezingTemperature(){
        assertEquals("15.0 is above freezing temperature", Task12.weatherInfo(59));
        assertEquals("0.0 is freezing temperature", Task12.weatherInfo(32));
        assertEquals("45.0 is above freezing temperature", Task12.weatherInfo(113));
    }

}