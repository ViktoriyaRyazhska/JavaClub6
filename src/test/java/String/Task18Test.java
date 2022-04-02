package String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task18Test {
    @Test
    void testRemove() {
        assertEquals("foo", Task18.remove("foo", 1));
        assertEquals("foo", Task18.remove("foo!", 1));
        assertEquals("Hi hi hi", Task18.remove("!!!Hi !!hi!!! !hi", 100));
    }
}

