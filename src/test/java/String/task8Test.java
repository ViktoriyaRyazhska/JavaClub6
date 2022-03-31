package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task8Test {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", Task8.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Task8.tripleTrouble("aa", "bb", "cc"));
        assertEquals("Batman", Task8.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Task8.tripleTrouble("LLh", "euo", "xtr"));
    }

}
