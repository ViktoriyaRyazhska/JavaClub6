package Loops;
import Classes.TestTask12;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestTask33 {
    @Test
    public void testSample() {

        assertArrayEquals(new int[]{1,15,15},Task33.humanYearsCatYearsDogYears(1));
        assertArrayEquals(new int[]{2,24,24},Task33.humanYearsCatYearsDogYears(2));

    }
}
