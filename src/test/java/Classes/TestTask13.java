ackage Classes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask13 {
    @Test
    public void testSample() {
        assertEquals(120, Task13.plus100(20));
        assertEquals(101, Task13.plus100(1));
    }

}