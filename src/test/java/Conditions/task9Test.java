package Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task9Test {
    @Test
    public void tests() {
        assertEquals("Yes", Task9.boolToWord(true));
        assertEquals("No", Task9.boolToWord(false));
    }
}
