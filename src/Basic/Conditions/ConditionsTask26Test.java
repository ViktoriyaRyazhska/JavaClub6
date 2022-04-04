package Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionsTask26Test {

    @Test
    public void testOddAndEven() {
        assertEquals(true, ConditionsTask26.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertEquals(false, ConditionsTask26.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertEquals(false,ConditionsTask26.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, ConditionsTask26.isLove(0, 1));
    }


}