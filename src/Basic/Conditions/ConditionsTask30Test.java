package Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionsTask30Test {
    @Test
    public void basicTests() {
        assertEquals("One", ConditionsTask30.switchItUp(1));
        assertEquals("Three", ConditionsTask30.switchItUp(3));
        assertEquals("Five", ConditionsTask30.switchItUp(5));
    }

}