package BasicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask4Test {

    @Test
    void isDivisible() {
        assertTrue(BasicTask4.isDivisible(4050,27));
        assertTrue(BasicTask4.isDivisible(10000,20));
        assertTrue(BasicTask4.isDivisible(10005,1));
        assertFalse(BasicTask4.isDivisible(4066,27));
        assertFalse(BasicTask4.isDivisible(10005,2));
    }
}