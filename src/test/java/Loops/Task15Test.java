package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {

    @Test
   public void testMakeMoveMethod() {
        assertEquals(1,Task15.makeMove(4));
        assertEquals(1,Task15.makeMove(8));
        assertEquals(1,Task15.makeMove(16));
        assertEquals(1,Task15.makeMove(0));
        assertEquals(3,Task15.makeMove(3));
        assertEquals(2,Task15.makeMove(6));

    }
}