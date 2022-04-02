package Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task3Test {

    @Test
    public void testConverter() {
        String strResult = Task3.convert(true);
        assertEquals(Boolean.TRUE.toString(), strResult);
    }

    @Test
    public void testConverter1() {
        String strResult = Task3.convert(false);
        assertEquals(Boolean.FALSE.toString(), strResult);
    }
}