package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask42 {

    @Test
    void twiceAsOld() {
        assertEquals(30, Task42.TwiceAsOld(30,0));
        assertEquals(16, Task42.TwiceAsOld(30,7));
        assertEquals(15, Task42.TwiceAsOld(45,30));
    }
}