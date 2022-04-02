package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {

    @Test
    public void testSummationMethod(){
        assertEquals(Task13.summation(8),36);
        assertEquals(Task13.summation(2),3);
        assertEquals(Task13.summation(5),15);
    }
}