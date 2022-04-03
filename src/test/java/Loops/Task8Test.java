package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {
    @Test
    public void firstTest(){
        assertEquals(24, Task8.grow(new int[]{1, 4, 6}));
    }
    @Test
    public void secondTest(){
        assertEquals(60, Task8.grow(new int[]{1, 4, 3, 5}));
    }
    @Test
    public void thirdTest(){
        assertEquals(100, Task8.grow(new int[]{100}));
    }
    @Test
    public void fourthTest(){
        assertEquals(20, Task8.grow(new int[]{4, 5}));
    }
    @Test
    public void fifthTest(){
        assertEquals(0, Task8.grow(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0}));
    }
}