package BasicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask2Test {
    BasicTask2 K = new BasicTask2();

    @Test
    public void multiply() {
        assertEquals(4, K.multiply(2, 2));
        assertEquals(10, K.multiply(5, 2));
        assertEquals(100, K.multiply(100, 1));
        assertEquals(0, K.multiply(0, 1000));
    }

}