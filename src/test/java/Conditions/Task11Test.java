package Conditions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task11Test {
    @Test
    void testSequence() {
        assertEquals(2, Task11.sequence(118));
        assertEquals(0, Task11.sequence(41));
        assertEquals(0, Task11.sequence(1));
        assertEquals(1, Task11.sequence(163));
    }
}

