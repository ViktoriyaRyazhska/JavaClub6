package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask26 {

    @Test
    void boolToWord() {
        assertEquals(Task26.boolToWord(true),"Yes");
        assertEquals(Task26.boolToWord(false),"No");
    }
}