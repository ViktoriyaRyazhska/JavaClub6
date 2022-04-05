package Conditions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionsTask28Test {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, ConditionsTask28.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, ConditionsTask28.enough(100, 60, 50));
        assertEquals("Should return 0.", 0, ConditionsTask28.enough(20, 5, 5));
    }

}