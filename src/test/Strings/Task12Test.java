package test.Strings;

import main.Strings.Task12;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task12Test {

    @Test
    void testPlusWeatherInfo() {
        Assert.assertEquals(Task12.weatherInfo(50),Task12.convertToCelsius(50) + " is above freezing temperature");

    }
    @Test
    void testMinusWeatherInfo() {
        Assert.assertEquals(Task12.weatherInfo(10),Task12.convertToCelsius(10)+" is freezing temperature");
    }

    @Test
    void convertToCelsius() {
        Assert.assertEquals(10, Task12.convertToCelsius(50), 0.0);
    }
}