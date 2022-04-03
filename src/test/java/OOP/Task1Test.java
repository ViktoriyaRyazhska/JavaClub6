package OOP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void testCreateMethod() {
        Human[] humans = Task1.create();
        assertTrue(humans[0] instanceof Man);
        assertTrue(humans[1] instanceof Woman);
    }
}