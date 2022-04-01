package test.Conditions;

import org.junit.Test;

import static main.Conditions.Task12.Main.switchItUp;
import static org.junit.Assert.assertEquals;

public class Task12Test {

    @Test
    public void testReturnWord() {
        assertEquals("Zero", switchItUp(0));
        assertEquals("One", switchItUp(1));
        assertEquals("Two", switchItUp(2));
        assertEquals("Three", switchItUp(3));
        assertEquals("Four", switchItUp(4));
        assertEquals("Five", switchItUp(5));
        assertEquals("Six", switchItUp(6));
        assertEquals("Seven", switchItUp(7));
        assertEquals("Eight", switchItUp(8));
        assertEquals("Nine", switchItUp(9));
    }

}
