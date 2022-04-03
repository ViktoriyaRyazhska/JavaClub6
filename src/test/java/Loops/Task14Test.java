package Loops;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    public void testGapMethod() {
        assertEquals("[101, 103]", Arrays.toString(Task14.gap(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(Task14.gap(4,100,110)));
        assertEquals(null, Task14.gap(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(Task14.gap(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(Task14.gap(10,300,400)));
    }
}