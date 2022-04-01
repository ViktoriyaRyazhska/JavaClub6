package test.Classes;

import main.Classes.Task6.Block;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    Block b=new Block(new int[]{2,4,6});
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getWidth() {
    }

    @Test
    void getLength() {
    }

    @Test
    void getHeight() {
    }

    @Test
    void getVolume() {
    }

    @Test
    void getSurfaceArea() {
        Assert.assertEquals(b.getHeight(),6);
        Assert.assertEquals(b.getWidth(),2);
        Assert.assertEquals(b.getLength(),4);
        Assert.assertEquals(b.getVolume(),48);
        Assert.assertEquals(88, b.getSurfaceArea());
    }
}