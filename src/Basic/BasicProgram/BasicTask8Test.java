package BasicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask8Test {

    @Test
    void century() {
        assertEquals(18, BasicTask8.century(1705));
        assertEquals(19, BasicTask8.century(1900));
        assertEquals(17, BasicTask8.century(1601));
        assertEquals(20, BasicTask8.century(2000));
        assertEquals(1,  BasicTask8.century(89));
    }
}