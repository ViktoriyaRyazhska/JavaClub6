package Basic;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask2 {

    @Test
    public void checkMultiply() {
        assertEquals(4, Task2.multiply(2, 2));
        assertEquals(50, Task2.multiply(2, 25));
        assertEquals(0, Task2.multiply(30, 0));
        assertEquals(0, Task2.multiply(0, 0));
    }
}