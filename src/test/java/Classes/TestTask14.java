package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask14 {

    Task14 f1 = new Task14(1, 4);
    Task14 f2 = new Task14(1, 16);

    @Test
    void getTop() {
        assertEquals(1, f1.getTop());
        assertEquals(1, f2.getTop());
    }

    @Test
    void getBottom() {
        assertEquals(4, f1.getBottom());
        assertEquals(16, f2.getBottom());
    }

    @Test
    void gcd() {
        assertEquals(4, f1.gcd(16,4));
        assertEquals(5, f2.gcd(0,5));
    }

    @Test
    void testToString() {
        assertEquals("4/5", (new Task14(2, 5).add(new Task14(2, 5))).toString());
        assertEquals("5/6", (new Task14(2, 4).add(new Task14(1, 3))).toString());
        assertEquals("13/15", (new Task14(1, 5).add(new Task14(4, 6))).toString());
        assertEquals(f1, new Task14(2,8));
        assertEquals("5/16",f1.add(f2).toString());
    }
}