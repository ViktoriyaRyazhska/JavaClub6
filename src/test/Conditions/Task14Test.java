package test.Conditions;

import org.junit.Assert;
import org.junit.Test;

import static main.Conditions.Task14.Main.TotalAmount;


public class Task14Test {
    @Test
    public void under3Tests() {
        Assert.assertEquals(40, TotalAmount(1));
        Assert.assertEquals(80, TotalAmount(2));
    }

    @Test
    public void under7Tests() {
        Assert.assertEquals(100, TotalAmount(3));
        Assert.assertEquals(140, TotalAmount(4));
        Assert.assertEquals(180, TotalAmount(5));
        Assert.assertEquals(220, TotalAmount(6));
    }

    @Test
    public void over7Tests() {
        Assert.assertEquals(230, TotalAmount(7));
        Assert.assertEquals(270, TotalAmount(8));
        Assert.assertEquals(310, TotalAmount(9));
        Assert.assertEquals(350, TotalAmount(10));
    }
}
