package Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class Task3Test {

    @Test
    void testConverter() {
        String strResult = Task3.convert(true);
        assertEquals(Boolean.TRUE.toString(), strResult);
    }

    @Test
    void testConverter1() {
        String strResult = Task3.convert(false);
        assertEquals(Boolean.FALSE.toString(), strResult);
    }
}