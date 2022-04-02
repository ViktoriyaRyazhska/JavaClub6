package test.Basic;

import main.Basic.Task2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    public void testMultiply() {
        Assert.assertEquals(Task2.multiply(2,2),4);
    }
}