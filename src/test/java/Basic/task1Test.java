package Basic;

import org.junit.Assert;
import org.junit.Test;

public class task1Test {
    task1 t = new task1();
    @Test
    public void test() {
        Assert.assertEquals( "Nope!" , 4, t.doubleInteger(2));
    }
}
