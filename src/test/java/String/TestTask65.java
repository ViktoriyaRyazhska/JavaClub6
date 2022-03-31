package String;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask65 {
    @Test
    public void test(){
        assertEquals("b***i***t***c***o***i***n", Task65.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a", Task65.twoSort(new String[] {"z", "a"}));
    }
}
