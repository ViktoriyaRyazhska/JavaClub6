package test.Conditions;

import main.Basic.Task2;
import org.junit.Test;

import static main.Conditions.Task2.Main.isDivisible;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task2Test {

    @Test
    public void testReturnTrue() {
        assertTrue(isDivisible(12, 4, 3));
        assertTrue(isDivisible(100, 10, 5));
        assertTrue(isDivisible(1000000, 1000000, 1000000));
    }
    @Test
    public void testReturnFalse() {
        assertFalse(isDivisible(13, 4, 3));
        assertFalse(isDivisible(100, 10, 3));
        assertFalse(isDivisible(1, 1000000, 1000000));
    }
}
