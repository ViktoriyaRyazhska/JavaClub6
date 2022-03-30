package Basic;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask4 {

    @Test
    public void example() {
        assertEquals(true, Task4.isDivisible(10,2));
        assertEquals(false, Task4.isDivisible(5,3));
    }


}
