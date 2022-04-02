package Conditions;
/**     Task 12
 * @author wertylu*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {

    @Test
    public void testSwitchItUp() {
        assertEquals("Zero", Task12.switchItUp(0));
        assertEquals("One", Task12.switchItUp(1));
        assertEquals("Eight", Task12.switchItUp(8));
        assertEquals("Four", Task12.switchItUp(4));
        assertEquals("Something went wrong", Task12.switchItUp(1230));
        assertEquals("Something went wrong", Task12.switchItUp(-1));

    }
}