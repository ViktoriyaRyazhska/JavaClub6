package Conditions;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask20 {
    @Test

    public void exampleTrueTask20 (){
        assertEquals("true", Task20.convert(true));
    }
@Test
    public void exampleFalseTask20(){
        assertEquals("false", Task20.convert(false));
}

}
