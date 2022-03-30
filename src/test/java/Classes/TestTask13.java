package Classes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask13 {

    Task13 testTask13 = new Task13();
    @Test
    public void testSample() {
        assertEquals(120, testTask13.plus100(20));
        assertEquals(101, testTask13.plus100(1));
    }

}