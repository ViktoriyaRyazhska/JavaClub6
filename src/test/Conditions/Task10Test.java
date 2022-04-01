package test.Conditions;

import main.Conditions.Task10.Task10;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Nullenough() {
        Assert.assertEquals(Task10.enough(10,5,5),0);
    }
    @Test
    void enough() {
        Assert.assertEquals(Task10.enough(10,5,6),1);
    }
}