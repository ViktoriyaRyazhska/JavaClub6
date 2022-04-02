package BasicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask9Test {

    @Test
    void makeNegative() {
        assertEquals(-42, BasicTask9.makeNegative(42));
    }
}