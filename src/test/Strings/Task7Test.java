package test.Strings;

import main.Strings.Task7;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    void removeSpaces() {
        Assert.assertEquals(Task7.removeSpaces("hello world"),"helloworld");
    }
}