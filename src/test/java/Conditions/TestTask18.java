package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask18 {

    @Test
    void opposite() {
        assertEquals(-1, Task18.opposite(1));
        assertEquals(0, Task18.opposite(0));
        assertEquals(56, Task18.opposite(-56));

    }
}