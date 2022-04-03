package Basic;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask2 {

    @Test
    public void checkMultiply() {
        assertEquals(4, task2.multiply(2, 2));
        assertEquals(50, task2.multiply(2, 25));
        assertEquals(0, task2.multiply(30, 0));
        assertEquals(0, task2.multiply(0, 0));
    }
}