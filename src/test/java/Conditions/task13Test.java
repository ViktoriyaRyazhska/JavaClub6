package Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task13Test {

    @Test
    public void tests() {
        assertEquals("green", Task13.updateLight("red"));
        assertEquals("yellow", Task13.updateLight("green"));
        assertEquals("red", Task13.updateLight("yellow"));
        assertEquals("error", Task13.updateLight("hello"));
        assertEquals("error", Task13.updateLight(""));

    }
}
