package Loops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task9Test {
    @Test
    void testSum() {
        assertEquals(4, Task9.sum(new int[]{1, 1, 1, 1}));
        assertEquals(3, Task9.sum(new int[]{0, 1, 1, 1}));
        assertEquals(4, Task9.sum(new int[]{1, 1, 1, 1}));
        assertEquals(3, Task9.sum(new int[]{0, 1, 1, 1}));
    }
}

