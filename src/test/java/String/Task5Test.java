package String;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task5Test {
    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(Task5.replaceDots("one.two.three")));
        assertEquals("Hello-World", Task5.replaceDots("Hello.World"));
    }
}
