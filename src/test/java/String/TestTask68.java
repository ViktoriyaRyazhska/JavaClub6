package String;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestTask68 {
@Test
public void fixedTests() {
    // assertEquals("expected", "actual");
    assertEquals("Hi", Task68.remove("Hi!", 1));
    assertEquals("Hi", Task68.remove("Hi!", 100));
    assertEquals("Hi!!", Task68.remove("Hi!!!", 1));
    assertEquals("Hi", Task68.remove("Hi!!!", 100));
    assertEquals("Hi", Task68.remove("!Hi", 1));
    assertEquals("Hi!", Task68.remove("!Hi!", 1));
    assertEquals("Hi", Task68.remove("!Hi!", 100));
    assertEquals("!!Hi !!hi!!! !hi", Task68.remove("!!!Hi !!hi!!! !hi", 1));
    assertEquals("Hi !!hi!!! !hi", Task68.remove("!!!Hi !!hi!!! !hi", 3));
    assertEquals("Hi hi!!! !hi", Task68.remove("!!!Hi !!hi!!! !hi", 5));
    assertEquals("Hi hi hi", Task68.remove("!!!Hi !!hi!!! !hi", 100));
}



}
