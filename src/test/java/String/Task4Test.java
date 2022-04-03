package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    @Test
    public void firstTest(){
        assertEquals(2, Task4.opposite(-2));
    }
    @Test
    public void secondTest(){
        assertEquals(-2, Task4.opposite(2));
    }
    @Test
    public void thirdTest(){
        assertEquals(0, Task4.opposite(0));
    }
    @Test
    public void fourthTest(){
        assertEquals(-20.3, Task4.opposite(20.3));
    }
    @Test
    public void fifthTest(){
        assertEquals(-2.5, Task4.opposite(2.5));
    }
}