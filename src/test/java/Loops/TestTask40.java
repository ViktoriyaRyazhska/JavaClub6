package Loops;


import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask40 {
    @Test
    public void exampleTestTask40(){
      assertEquals(10, Task40.sum(new int[] {2,3,5}));
        assertEquals(20, Task40.sum(new int[] {2,3,5,-5,-1,0,10}));
        assertEquals(0, Task40.sum(new int[] {-2,-3,-5}));
        assertEquals(0, Task40.sum(new int[]{}));


    }


}
