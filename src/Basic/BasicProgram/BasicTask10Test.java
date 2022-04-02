package BasicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask10Test {

    @Test
    void datingRange() {
        assertEquals("15-20", BasicTask10.datingRange(17));
        assertEquals("27-66", BasicTask10.datingRange(40));
        assertEquals("14-16", BasicTask10.datingRange(15));
        assertEquals("24-56", BasicTask10.datingRange(35));
        assertEquals("9-11", BasicTask10.datingRange(10));
    }
}