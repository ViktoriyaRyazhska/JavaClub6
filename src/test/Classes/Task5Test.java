package test.Classes;
import main.Classes.Task5.Fighter;
import org.junit.Assert;
import org.junit.Test;

import static main.Classes.Task5.Fighter.declareWinner;

public class Task5Test {
    @Test
    public void basicTests() {
        Assert.assertEquals("Lew", declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        Assert.assertEquals("Harry", declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        Assert.assertEquals("Harald", declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        Assert.assertEquals("Harald", declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        Assert.assertEquals("Harald", declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        Assert.assertEquals("Harald", declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}
