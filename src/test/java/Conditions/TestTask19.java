package Conditions;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class TestTask19 {
    @Test
    public void test1() {
        assertEquals(true, Task19.isDivisible(12,4,3));
    }
    @Test
    public void test2() {
        assertEquals(false, Task19.isDivisible(3,3,4));
    }
}
