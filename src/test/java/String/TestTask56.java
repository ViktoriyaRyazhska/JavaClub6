package String;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask56 {
    @Test
    public void exampleTestTask56(){
        assertEquals("Roman plays banjo", Task56.areYouPlayingBanjo("Roman"));
        assertEquals("rikki plays banjo", Task56.areYouPlayingBanjo("rikki"));
        assertEquals("Tom does not play banjo", Task56.areYouPlayingBanjo("Tom"));
    }
}
