package String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTask63 {
    @Test
    public void testFixed() {
        assertEquals("S.H", Task63.abbrevName("Sam Harris"));
        assertEquals("P.F", Task63.abbrevName("Patrick Feenan"));
        assertEquals("E.C", Task63.abbrevName("Evan Cole"));
        assertEquals("P.F", Task63.abbrevName("P Favuzzi"));
        assertEquals("D.M", Task63.abbrevName("David Mendieta"));
    }
}
