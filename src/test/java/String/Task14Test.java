package String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task14Test {
    @Test
    void testStrCount() {
        assertEquals(0, Task14.strCount("Str", 'A'));
        assertEquals(1, Task14.strCount("Str", 'S'));
    }
}

