package BasicProgram;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
class BasicTask5Test {

    @Test
    void greet() {
        assertEquals("should greet some people normally", "Hello, Jim!", BasicTask5.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", BasicTask5.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", BasicTask5.greet("Simon"));
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", BasicTask5.greet("Johnny"));
    }
}