package test.Loop;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static main.Loop.Task5.CountSheeps;

public class Task5Test {
    Boolean[] array1 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };
    Boolean[] array2 = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            true, true, true,  true };

    Boolean[] array3 = { false, false, false};

    @Test
    public void test() {
        Assert.assertEquals("There are 17 sheep in total", 17,  CountSheeps(Arrays.stream(array1).toList()));
        Assert.assertEquals("There are 19 sheep in total", 19,  CountSheeps(Arrays.stream(array2).toList()));
        Assert.assertEquals("There are 0 sheep in total", 0,  CountSheeps(Arrays.stream(array3).toList()));
    }
}
