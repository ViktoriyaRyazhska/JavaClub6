package test.Basic;

import main.Basic.Task4;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task4Test {

    @Test
    public void testReturnTrue() {
        assertTrue(Task4.isDivisible(4050, 27));
        assertTrue(Task4.isDivisible(10000, 20));
        assertTrue(Task4.isDivisible(4050, 27));
        assertTrue(Task4.isDivisible(10005, 1));
    }

    @Test
    public void testReturnFalse() {
        assertFalse(Task4.isDivisible(4055, 27));
        assertFalse(Task4.isDivisible(999, 20));
        assertTrue(Task4.isDivisible(4050, 27));
        assertFalse(Task4.isDivisible(10005, 2));
    }
}
