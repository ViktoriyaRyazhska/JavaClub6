package Conditions;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask21 {
    @Test
    public void test1() {
        assertEquals(20, Task21.bonusTime(20,false));
    }
    @Test
    public void test1() {
        assertEquals(200, Task21.bonusTime(20,true));
    }
}