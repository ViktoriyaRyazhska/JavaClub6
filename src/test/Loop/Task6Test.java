package test.Loop;

import main.Loop.Task6;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void reverse() {
        Assert.assertEquals(Arrays.toString(Task6.reverse(5)),Arrays.toString(new int[]{5,4,3,2,1}));

    }
}