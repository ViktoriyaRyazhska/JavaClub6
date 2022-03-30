package Basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask8 {
    @Test

    public void exampleTask8(){
        assertEquals(18, Task8.century(1705));
        assertEquals(19, Task8.century(1900));
    }

}
