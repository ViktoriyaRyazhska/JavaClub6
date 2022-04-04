package Conditions;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task7Test {
    @Test
    public void testBasicMath() {
        assertEquals(0, Task7.basicMath("qwe", 1, 1).intValue());
        assertEquals(20, Task7.basicMath((String) "/", 60, 3).intValue());
        assertEquals(4, Task7.basicMath((String) "-", 5, 1).intValue());
        assertThat(Task7.basicMath((String) "+", 5, 5), is(10));
        assertThat(Task7.basicMath((String) "*", 5, 5), is(25));
        assertThrows(ArithmeticException.class, () -> Task7.basicMath("/", 1, 0));
    }
}
