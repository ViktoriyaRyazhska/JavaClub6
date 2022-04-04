package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask58 {

    @Test
    void tripleTrouble() {
        assertEquals("ttlheoiscstk", Task58.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Task58.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", Task58.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Task58.tripleTrouble("LLh","euo","xtr"));
    }
}