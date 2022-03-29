package Basic;


import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class TestTask7 {
    @Test
    public void test1(){
        assertEquals(61000, Task7.Past(0,1,1));
    }
}