package BasicProgram;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BasicTask1Test {

    @Test
    void doubleInteger() {
        Assert.assertEquals( "Nope!" , 4, BasicTask1.doubleInteger(2));
    }
}