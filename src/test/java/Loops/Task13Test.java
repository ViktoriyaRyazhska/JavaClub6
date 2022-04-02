package Loops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task13Test {
    @Test
    void testSummation() {
        assertEquals(1, Task13.summation(1));
        assertEquals(36, Task13.summation(8));

    }
}

