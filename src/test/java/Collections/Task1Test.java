package Collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public void test(){
        List<String> items = Task1.push();
        assertEquals(1, items.size());
        assertEquals("an object", items.get(0));
    }
}