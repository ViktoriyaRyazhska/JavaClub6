package Basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task8Test {
    @Test
    void testCentury() {
        assertEquals(1, Task8.century(10));
        assertEquals(17, Task8.century(1601));
        assertEquals(20, Task8.century(2000));
        assertEquals(1,  Task8.century(89));
    }
}

