package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    @Test
    public void firstTest(){
        assertEquals(20, Task9.sum(new int[]{-1, 10, 5, 3, 2, -20}));
    }
    @Test
    public void secondTest(){
        assertEquals(0, Task9.sum(new int[]{-100, -200, -500}));
    }
    @Test
    public void thirdTest(){
        assertEquals(1, Task9.sum(new int[]{1, 0, -20, -500}));
    }
    @Test
    public void fourthTest(){
        assertEquals(7, Task9.sum(new int[]{3, 4, -20, -90, 0}));
    }
    @Test
    public void fifthTest(){
        assertEquals(11, Task9.sum(new int[]{5, 4, 2, -100, 0, -200}));
    }
}