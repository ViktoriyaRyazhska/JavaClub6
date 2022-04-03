package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void firstTest(){
        assertEquals("-20", Task1.numberToString(-20));
    }
    @Test
    public void secondTest(){
        assertEquals("2", Task1.numberToString(2));
    }
    @Test
    public void thirdTest(){
        assertEquals("0", Task1.numberToString(0));
    }
    @Test
    public void fourthTest(){
        assertEquals("100", Task1.numberToString(100));
    }
    @Test
    public void fifthTest(){
        assertEquals("-10", Task1.numberToString(-10));
    }
}