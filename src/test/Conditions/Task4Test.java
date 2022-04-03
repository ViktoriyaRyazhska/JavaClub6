package test.Conditions;

import org.junit.Assert;
import org.junit.Test;

import static main.Conditions.Task4.Fatcat.bonusTime;

public class Task4Test {
    @Test
    public void basicTests() {
        boolean wellConfigured=unicodeTest();
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"100000", bonusTime(10000, true));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"250000",bonusTime(25000, true));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"10000",bonusTime(10000, false));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"60000",bonusTime(60000, false));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"20",bonusTime(2, true));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"78",bonusTime(78, false));
        Assert.assertEquals((wellConfigured?"£":"\u00A3")+"678900",bonusTime(67890, true));
    }

    public boolean unicodeTest(){
        System.out.println("\u00A3 == £:"+"\u00A3".equalsIgnoreCase("£"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("£");
    }
}