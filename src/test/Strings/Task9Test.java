package test.Strings;

import main.Strings.Task9;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task9Test {

    @Test
    public void basicTests() {
        assertEquals("Position of alphabet: 1", Task9.position('a'));
        assertEquals("Position of alphabet: 26", Task9.position('z'));
        assertEquals("Position of alphabet: 5", Task9.position('e'));
    }
}
