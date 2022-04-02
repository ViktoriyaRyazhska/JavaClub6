package BasicProgram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask6Test {

    @Test
    void toBinary() {
        assertEquals(1, BasicTask6.toBinary(1));
        assertEquals(10, BasicTask6.toBinary(2));
        assertEquals(11, BasicTask6.toBinary(3));
        assertEquals(101, BasicTask6.toBinary(5));
    }
}