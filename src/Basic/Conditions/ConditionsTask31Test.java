package Conditions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConditionsTask31Test {
    @Test
    public void update_light() {
        assertEquals("green", ConditionsTask31.updateLight("red"));
        assertEquals("yellow", ConditionsTask31.updateLight("green"));
        assertEquals("red", ConditionsTask31.updateLight("yellow"));
    }

}