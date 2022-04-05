package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTask12Test {
    @Test
    public void testSample() {
        ClassTask12Test ed = new ClassTask12Test();
        assertEquals(1,ed.getNumber());

    }
    private double getNumber() {
        return 1;
    }

}