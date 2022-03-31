package Loops;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class TestTask41 {
    @Test
    public void test(){
        Assertions.assertArrayEquals(new String[]{"a","b","c"},Task41.fixTheMeerkat(new String[]{"c","b","a"}));
        Assertions.assertArrayEquals(new String[]{"a","b"},Task41.fixTheMeerkat(new String[]{"b","a"}));
    }
}
