package test.Conditions;

import org.junit.Test;

import static main.Conditions.Task7.Main.basicMath;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Task7Test {
    @Test
    public void testAdd() {
        assertThat(basicMath("+", 4, 7), is(11));
    }
    @Test
    public void testSubtract() {
        assertThat(basicMath("-", 15, 18), is(-3));
    }
    @Test
    public void testMultiply() {
        assertThat(basicMath("*", 5, 5), is(25));
    }
    @Test
    public void testDivide() {
        assertThat(basicMath("/", 49, 7), is(7));
    }
}

