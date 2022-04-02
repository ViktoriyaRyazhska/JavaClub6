package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task9Test {
    task9 Kata = new task9();
    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
}
