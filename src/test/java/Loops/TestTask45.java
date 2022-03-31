package Loops;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class TestTask45 {
    @Test
    public void test(){
        Assertions.assertArrayEquals(new long []{101, 103},Task45.gap(2,100,110));
        Assertions.assertArrayEquals(null,Task45.gap(6,100,110));
    }
}
