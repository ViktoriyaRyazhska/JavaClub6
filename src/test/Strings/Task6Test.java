package test.Strings;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static main.Strings.Task6.BanjoPlay;


public class Task6Test {
    @Test
    public void testWhetherPeoplePlay() {
        assertEquals( "Martin does not play banjo", BanjoPlay("Martin"));
        assertEquals( "Rikke plays banjo", BanjoPlay("Rikke"));
        assertEquals(  "rolf plays banjo", BanjoPlay("rolf"));
        assertEquals( "bravo does not play banjo",BanjoPlay("bravo"));
        assertEquals( "Ostap does not play banjo",BanjoPlay("Ostap"));

    }
}
