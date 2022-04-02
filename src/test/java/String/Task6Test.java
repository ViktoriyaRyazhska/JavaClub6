package String;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Task6Test {
    @Test
    void testAreYouPlayingBanjo() {
        assertEquals("Name does not play banjo", Task6.areYouPlayingBanjo("Name"));
        assertEquals("roman plays banjo", Task6.areYouPlayingBanjo("roman"));
    }
}

