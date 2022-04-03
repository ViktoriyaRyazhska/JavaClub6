package test.Strings;

import org.junit.Test;

import static main.Strings.Task1.ToString;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Task1Test {
    @Test
    public void tests() {
        assertEquals("67", ToString(67));
        assertEquals("123", ToString(123));
        assertEquals("999", ToString(999));
        assertEquals("-23", ToString(-23));
        assertEquals("0", ToString(0));

    }
}
