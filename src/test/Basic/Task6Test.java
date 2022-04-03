package test.Basic;

import main.Basic.Task6;
import org.junit.Assert;
import org.junit.Test;

public class Task6Test {
    @Test
    public final void testToBinary() {
        Assert.assertEquals(1, Task6.ToBinary(1));
        Assert.assertEquals(10, Task6.ToBinary(2));
        Assert.assertEquals(11, Task6.ToBinary(3));
        Assert.assertEquals(101, Task6.ToBinary(5));
        Assert.assertEquals(1111, Task6.ToBinary(15));
        Assert.assertEquals(10000111, Task6.ToBinary(135));
    }
}
