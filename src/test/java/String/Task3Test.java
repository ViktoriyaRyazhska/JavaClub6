package String;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Task3Test {
    Task3 h = new Task3();
    @Test
    public void test1() throws Exception {
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }
}
