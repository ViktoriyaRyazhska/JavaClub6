package BasicPrograms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void firstTest(){
        assertEquals(0, Task1.doubleInteger(0));
    }
    @Test
    public void secondTest(){
        assertEquals(2, Task1.doubleInteger(1));
    }
    @Test
    public void thirdTest(){
        assertEquals(4, Task1.doubleInteger(2));
    }
    @Test
    public void fourthTest(){
        assertEquals(6, Task1.doubleInteger(3));
    }
    @Test
    public void fifthTest(){
        assertEquals(8, Task1.doubleInteger(4));
    }
}