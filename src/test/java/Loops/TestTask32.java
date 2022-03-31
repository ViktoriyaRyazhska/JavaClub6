package Loops;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask32 {
    @Test
    public void exampleTestTask32(){
        assertEquals("III",Task32.repeatStr(3,"I"));
        assertEquals("",Task32.repeatStr(5,""));
        assertEquals("",Task32.repeatStr(0,"Hello"));
    }
}
