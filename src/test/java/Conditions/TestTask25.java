import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTask25 {

    @Test
    public void testOddAndEven() {
        assertEquals(true, OppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
        assertEquals(false, OppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
        assertEquals(false, OppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
        assertEquals(true, OppositesAttract.isLove(0, 1));
    }

}