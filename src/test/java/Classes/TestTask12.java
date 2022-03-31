package Classes;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask12 {
    @Test
    public void testSample() {
        TestTask12 ed = new TestTask12();
        assertEquals(1,ed.getNumber());

}
    private double getNumber() {
        return 1;
    }
}
