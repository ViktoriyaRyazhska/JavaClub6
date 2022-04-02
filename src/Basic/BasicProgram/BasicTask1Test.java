package BasicProgram;

import BasicProgram.BasicTask1;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTask1Test {

    @Test
    void doubleInteger() {
        Assert.assertEquals( "Nope!" , 4, BasicTask1.doubleInteger(2));
    }
}