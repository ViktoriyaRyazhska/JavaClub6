package Basic;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task4Test {

    @org.junit.jupiter.api.Test
    public void testIsDivisible() {
        assertThrows(ArithmeticException.class, () -> Task4.isDivisible(3, 0));
        assertTrue(Task4.isDivisible(1, 1));
        assertTrue(Task4.isDivisible(45612, 3));
        assertFalse(Task4.isDivisible(1, 34578));

    }


    @org.junit.jupiter.api.Test
    void isDivisible() {
    }
}

