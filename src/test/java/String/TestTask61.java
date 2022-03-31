package String;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestTask61 {
    @Test
    public void test(){
       assertEquals(5, Task61.howOld("5 years old"));
        assertEquals(9,Task61.howOld("9 years old"));
    }
}
