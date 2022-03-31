package String;


import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask60 {
    @Test

public void exampleTestTask60(){
        assertEquals("10011", Task60.fakeBin("83377"));
        assertEquals("101000111101101", Task60.fakeBin("509321967506747"));
    }

}
