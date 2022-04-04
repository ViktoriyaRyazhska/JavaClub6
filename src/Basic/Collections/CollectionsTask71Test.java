package Collections;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CollectionsTask71Test {
      CollectionsTask71 k= new CollectionsTask71();

    @Test
    public void SampleTests() {
        assertEquals(Arrays.asList(1), k.CreateList(1));
        assertEquals(Arrays.asList(1,2), k.CreateList(2));
        assertEquals(Arrays.asList(1,2,3), k.CreateList(3));
        assertEquals(Arrays.asList(1,2,3,4), k.CreateList(4));
        assertEquals(Arrays.asList(1,2,3,4,5), k.CreateList(5));
    }

}