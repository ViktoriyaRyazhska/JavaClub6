package test.Strings;

import main.Strings.Task14;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task14Test {

    @Test
    public void testReturnZeroWhenEmptyString() {
        assertEquals(0, Task14.strCount("", 'z'));
    }

    @Test
    public void testReturnZeroWhenNoOccurrencesFound() {
        assertEquals(0, Task14.strCount("Library", 'f'));
        assertEquals(0, Task14.strCount("Hello", 'a'));
    }

    @Test
    public void testSomething() {
        assertEquals(6, Task14.strCount("Caaataaas", 'a'));
        assertEquals(1, Task14.strCount("Hello", 'e'));
        assertEquals(2, Task14.strCount("Hello", 'l'));
    }
}
