package Collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask72 {

    @Test
    public void exampleTestTask(){
        Task72 w = new Task72();
        w.newEntry("Apple","Fruit");
        assertEquals("Fruit",w.look("Apple"));
        w.newEntry("football", "popular sport");
        assertEquals("popular sport", w.look("football"));
        assertEquals("Cant find entry for Hi", w.look("Hi"));
    }

}
