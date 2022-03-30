package Basic;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask6 {

    @Test
    public void testToBinary() {
        assertEquals(1, Task6.toBinary(1));
        assertEquals(10, Task6.toBinary(2));
        assertEquals(11, Task6.toBinary(3));
        assertEquals(101, Task6.toBinary(5));
        assertEquals(0, Task6.toBinary(0));
        assertEquals(100000000, Task6.toBinary(256));
    }

}