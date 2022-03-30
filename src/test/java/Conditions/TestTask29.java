package Collections;

import org.junit.Test;
import java.util.List;
import java.util.*;
import static org.junit.Assert.assertEquals;
public class TestTask29 {
@Test
public void test1(){
assertEquals("One",Task29.switchItUp(1))
}
    public void test2(){
        assertEquals("Zero",Task29.switchItUp(0))
    }
    public void test3(){
        assertEquals("Nine",Task29.switchItUp(9))
    }
}
