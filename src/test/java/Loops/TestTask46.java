package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask46 {

    @Test
    void makeMove() {
        assertEquals(3, Task46.makeMove(3));
        assertEquals(2, Task46.makeMove(2));
    }
}