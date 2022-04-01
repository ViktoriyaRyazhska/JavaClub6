package Conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
void testConverter(){
    String strResult = Task3.convert(true);
    assertEquals(Boolean.TRUE.toString(), strResult);
}
    @Test
    void testConverter1(){
        String strResult = Task3.convert(false);
        assertEquals(Boolean.FALSE.toString(), strResult);
    }
}