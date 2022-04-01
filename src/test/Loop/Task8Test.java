package test.Loop;

import main.Loop.Task8;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Task8Test {

    @Test
    public void testSomething() {
        assertEquals(6, Task8.grow(new int[]{1,2,3}));
        assertEquals(16, Task8.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, Task8.grow(new int[]{2,2,2,2,2,2}));
    }

    @Test
    public void randomTests(){
        for(int i = 0; i<100;i++){
            int[] x = randomArray();
            assertEquals(grow(x), Task8.grow(x));
        }
    }

    public static int grow(int[] x){
        int res = 1;
        for(int i : x)
            res *= i;
        return res;
    }

    public static int[] randomArray() {
        Random r = new Random();
        int size = r.nextInt(10)+1;
        int[] res = new int[size];
        for(int i = 0; i < size;i++)
            res[i] = r.nextInt(10) + 1;
        return res;
    }
}
