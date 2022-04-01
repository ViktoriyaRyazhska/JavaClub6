package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task13Test {
    @Test
    public void testAbbrevName() {
        assertEquals("S.H", Task13.abbrevName("Sam Harris"));
        assertEquals("A.T", Task13.abbrevName("Anna-Okasana Tarasova"));
        assertEquals("P.F", Task13.abbrevName("P Favuzzi"));
        assertEquals("D.M", Task13.abbrevName("David Mendieta"));
        assertEquals("D.M", Task13.abbrevName("daniel mentor"));
    }
}
