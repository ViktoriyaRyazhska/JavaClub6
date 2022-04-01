package Classes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

class Task1Test {

    @Test
    void testConstructor() {
        Object o = new Object();
        Task1 task1 = new Task1();
        task1.setNumber(10);
        task1.setStringValue("value");
        task1.setAnObject(o);
        assertSame(o, task1.getAnObject());
        assertEquals(10, task1.getNumber());
        assertEquals("value", task1.getStringValue());
    }

    @Test
    void testConstructor2() {
        Object o = new Object();
        Task1 task1 = new Task1(10, "value", o);
        task1.setNumber(10);
        task1.setStringValue("value");
        task1.setAnObject(o);
        assertSame(o, task1.getAnObject());
        assertEquals(10, task1.getNumber());
        assertEquals("value", task1.getStringValue());
    }
}