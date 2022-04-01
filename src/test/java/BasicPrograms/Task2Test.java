package BasicPrograms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    @Test
    public void firstTest(){
        assertEquals(2, Task2.multiply(1, 2));
    }
    @Test
    public void secondTest(){
        assertEquals(6, Task2.multiply(2, 3));
    }
    @Test
    public void thirdTest(){
        assertEquals(10, Task2.multiply(5, 2));
    }
    @Test
    public void fourthTest(){
        assertEquals(0, Task2.multiply(0, 2455));
    }
    @Test
    public void fifthTest(){
        assertEquals(9, Task2.multiply(3, 3));
    }
}