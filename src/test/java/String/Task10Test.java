package String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task10Test {
    @Test
    void testFakeBin() {
        assertEquals("00", Task10.fakeBin("42"));
        assertEquals("111", Task10.fakeBin("foo"));
    }
}

