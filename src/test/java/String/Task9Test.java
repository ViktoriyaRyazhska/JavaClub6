package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    public void testPosition() {
        assertEquals("Position of alphabet: 1",Task9.position('a'));
        assertEquals("Position of alphabet: 2",Task9.position('b'));
        assertEquals("Position of alphabet: 4",Task9.position('d'));
    }
}