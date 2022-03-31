package String;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class TestTask57 {
    @Test
    public void test(){
        Assertions.assertEquals("dfgsdsfgdsfg",
                Task57.noSpace("dfgsd sfg dsfg "));

    }
    @Test
    public void test2(){
        Assertions.assertEquals("hallo",
                Task57.noSpace("hallo"));

    }
}
