package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {
    @Test
    public void testIfMethodAbbrevNameReturnCorrectly(){
        assertEquals(Task13.abbrevName("Rostyk Postyk"), "R.P");
        assertEquals(Task13.abbrevName("Michael Smith"), "M.S");
    }

}