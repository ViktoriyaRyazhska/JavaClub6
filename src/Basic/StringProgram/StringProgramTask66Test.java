package StringProgram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringProgramTask66Test {
    @Test
    public void testFixed() {
        assertEquals("b***i***t***c***o***i***n", StringProgramTask66.twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        assertEquals("a***r***e", StringProgramTask66.twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
    }

}