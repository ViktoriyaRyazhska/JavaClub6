package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    public void testStrCountMethod() {
        assertEquals(2,Task14.strCount("sister",'s'));
        assertEquals(3,Task14.strCount("sisster",'s'));
        assertEquals(4,Task14.strCount("sissster",'s'));
        assertEquals(0,Task14.strCount("brother",'s'));
        assertEquals(1,Task14.strCount("brother",'b'));

    }
}