package test.Conditions;

import org.junit.Assert;
import org.junit.Test;

import static main.Conditions.Task9.Main.ConvertToString;

public class Task9Test {
    @Test
    public void testBoolToWord() {
        Assert.assertEquals(ConvertToString(true), "Yes");
        Assert.assertEquals(ConvertToString(false), "No");
    }
}
