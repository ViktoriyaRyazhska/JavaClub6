package test.Basic;

import main.Basic.Task1;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    @Test
    public final void testDouble() {
        Assert.assertEquals( "Nope!" , 4, Task1.Double(2));
        Assert.assertEquals( "Nope!" , 6, Task1.Double(3));
        Assert.assertEquals( "Nope!" , -2, Task1.Double(-1));
        Assert.assertEquals( "Nope!" , -26, Task1.Double(-13));
    }
}
