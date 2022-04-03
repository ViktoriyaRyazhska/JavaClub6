package test.Basic;

import main.Basic.Task11;
import org.junit.Assert;
import org.junit.Test;

public class Task11Test {
        @Test
        public void testAbove() {
            Assert.assertEquals("10.0 is above freezing temperature", Task11.weatherInfo(50));
        }
        @Test
        public void testUnder() {
            Assert.assertEquals("-5.0 is freezing temperature", Task11.weatherInfo(23));
        }
}