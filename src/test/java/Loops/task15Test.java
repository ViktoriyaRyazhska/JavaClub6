package Loops;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task15Test {
    @Test
    public void tests() {

        assertEquals(3, Task15.makeMove(3));
        assertEquals(1, Task15.makeMove(99));
        assertEquals(2, Task15.makeMove(10));
        assertEquals(1, Task15.makeMove(0));

    }
}
