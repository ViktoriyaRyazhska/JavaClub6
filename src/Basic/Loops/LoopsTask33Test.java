package Loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopsTask33Test {
    @Test
    public void test4a() {
        assertEquals("aaaa", LoopsTask33.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", LoopsTask33.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", LoopsTask33.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", LoopsTask33.repeatStr(0, "kata"));
    }
}
