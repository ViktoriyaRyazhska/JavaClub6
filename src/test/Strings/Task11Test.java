package test.Strings;

import main.Strings.Task11;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task11Test {
    @Test
    public void testDifferentEntries() {
        assertEquals(5, Task11.HowOldAreYou("5 years old"));
        assertEquals(9, Task11.HowOldAreYou("9 years old"));
        assertEquals(1, Task11.HowOldAreYou("1 year old"));
        assertEquals(4, Task11.HowOldAreYou("4 year old"));
        assertEquals(2, Task11.HowOldAreYou("2 year old"));
    }

}
