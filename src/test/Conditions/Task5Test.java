package test.Conditions;

import main.Conditions.Task5.AgeDiff;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testIfNullCalculateAge() {
        Assert.assertEquals(AgeDiff.CalculateAge(2012,2012),"You were born this very year!");
    }
    @Test
    public void testIfOneCalculateAge(){
        Assert.assertEquals(AgeDiff.CalculateAge(2012,2013),"You are 1 year old.");
    }

    @Test
    public void testIfMinusOneCalculateAge(){
        Assert.assertEquals(AgeDiff.CalculateAge(2012,2011),"You will be born in 1 year.");
    }

    @Test
    public void testIfMoreNullCalculateAge(){
        Assert.assertEquals(AgeDiff.CalculateAge(2012,2023),"You are " + 11+ " years old.");
    }

    @Test
    public void testIfLessNullCalculateAge(){
        Assert.assertEquals(AgeDiff.CalculateAge(2023,2012),"You will be born in " + 11 + " years.");
    }
}