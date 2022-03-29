package String;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestTask55 {
    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(Task55.replaceDots("one.two.three")));
        assertTrue("Sorry, try again :-(", "hi-greeting-from-Ukraine".equals(Task55.replaceDots("hi.greeting.from.Ukraine")));
    }
}
