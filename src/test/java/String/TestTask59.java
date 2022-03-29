package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTask59 {
    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Task59.position('a'));
        assertEquals("Position of alphabet: 26", Task59.position('z'));
        assertEquals("Position of alphabet: 5", Task59.position('e'));
    }
}
