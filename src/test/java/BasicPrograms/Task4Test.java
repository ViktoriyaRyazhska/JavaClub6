package BasicPrograms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    public void testIsDivisible() {
        assertTrue(Task4.isDivisible(4,4));
        assertTrue(Task4.isDivisible(27,3));
        assertTrue(Task4.isDivisible(12,6));
        assertFalse(Task4.isDivisible(4,1234129));
        assertFalse(Task4.isDivisible(111,2));
    }
}