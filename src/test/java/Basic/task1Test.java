package Basic;

import org.junit.Assert;
import org.junit.Test;

public class task1Test {

    @Test
    public void test() {
        Assert.assertEquals("Nope!", 4, task1.doubleInteger(2));
    }
}
