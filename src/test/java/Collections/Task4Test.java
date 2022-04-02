package Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task4Test {
    @Test
    void testNewEntry() {
        Task4 task4 = new Task4();
        task4.newEntry("Key", "42");
        task4.newEntry("Key1", "1");
        task4.newEntry("Key2", "2");
        assertEquals("1", task4.look("Key1"));
        assertEquals(3, task4.dictionary.size());
    }

    @Test
    void testLook() {
        assertEquals("Cant find entry for Key", (new Task4()).look("Key"));
    }
}

