package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task9Test {
    @Test
    public void testPosition() {
        assertEquals("Position of alphabet: 1", Task9.position('a'));
        assertEquals("Position of alphabet: 2", Task9.position('b'));
        assertEquals("Position of alphabet: 3", Task9.position('c'));
        assertTrue("Position of alphabet: 26".equals(Task9.position('z')));
    }
}
