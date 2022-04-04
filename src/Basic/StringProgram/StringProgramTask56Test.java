package StringProgram;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class StringProgramTask56Test {
    @Test
    public void testSomeDots() {
        assertTrue("Sorry, try again :-(", "one-two-three".equals(StringProgramTask56.replaceDots("one.two.three")));
    }

}