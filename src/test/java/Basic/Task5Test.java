package Basic;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task5Test {
    task5 Greeter = new task5();
    @Test
    public void test() {
        assertEquals("should greet some people normally", "Hello, Jim!", Greeter.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", Greeter.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", Greeter.greet("Simon"));
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", Greeter.greet("Johnny"));
    }
}
