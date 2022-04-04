package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    @Test
    public void firstTest(){
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!", Task3.sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona"));
    }
    @Test
    public void secondTest(){
        assertEquals("Hello, Maksym Korolkov! Welcome to Lviv, Lvivshchyna!", Task3.sayHello(new String[]{"Maksym", "Korolkov"}, "Lviv", "Lvivshchyna"));
    }
}