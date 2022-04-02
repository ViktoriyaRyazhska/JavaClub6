package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task12Test {

    @Test
    public void testSomething() {
        assertEquals("One", Task12.sequence(1));
        assertEquals("Three", Task12.sequence(3));
        assertEquals("Five", Task12.sequence(5));
        assertEquals("99", Task12.sequence(99));
    }
}
