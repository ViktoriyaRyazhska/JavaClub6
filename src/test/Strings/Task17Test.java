package test.Strings;

import main.Strings.Task17;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void toAlternativeString() {
        Assert.assertEquals(Task17.toAlternativeString("Hello World"),"hELLO wORLD");
    }
}