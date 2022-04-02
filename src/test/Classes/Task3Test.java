package test.Classes;

import main.Classes.Task3.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task3Test {

    @Test
    public void testGeneral() {
        assertEquals(new Fraction(37, 40), new Fraction(1, 8).add(new Fraction(4, 5)));
        assertEquals(new Fraction(1, 1), new Fraction(1, 4).add(new Fraction(3, 4)));
        assertEquals(new Fraction(863483, 416760), new Fraction(911, 920).add(new Fraction(980, 906)));
        assertEquals(new Fraction(838923, 926885), new Fraction(610, 941).add(new Fraction(253, 985)));
        assertEquals(new Fraction(16880, 3591), new Fraction(956, 798).add(new Fraction(662, 189)));
    }

    @Test
    public void testReduction() {
        assertEquals(new Fraction(1, 2), new Fraction(4, 8));
        assertEquals(new Fraction(2, 3), new Fraction(10, 15));
        assertEquals(new Fraction(4, 9), new Fraction(24, 54));
    }

    @Test
    public void testToString() {
        assertEquals("4/5", (new Fraction(2, 5).add(new Fraction(2, 5))).toString());
        assertEquals("5/6", (new Fraction(2, 4).add(new Fraction(1, 3))).toString());
        assertEquals("13/15", (new Fraction(1, 5).add(new Fraction(4, 6))).toString());
    }
}
