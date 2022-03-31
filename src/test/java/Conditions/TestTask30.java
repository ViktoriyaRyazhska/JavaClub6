package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask30 {

    @Test
    void updateLight() {
        assertEquals("green", Task30.updateLight("red"));
        assertEquals("yellow", Task30.updateLight("green"));
        assertEquals("red", Task30.updateLight("yellow"));
    }
}