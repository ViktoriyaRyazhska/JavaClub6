package String;
import Loops.Task41;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class TestTask53 {
    @Test
    public void test(){
        Task53 h = new Task53();
        String[] name = {"John", "Smith"};
        Assertions.assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));

    }
    @Test
    public void test2(){
        Task53 h = new Task53();
        String[] name = {"J", "S"};
        Assertions.assertEquals("Hello, J S! Welcome to Phoenix,  !",
                h.sayHello(name, "Phoenix", " "));

    }
}
