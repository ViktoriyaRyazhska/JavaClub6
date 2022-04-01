package String;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task17Test {
    @Test
    public void TestToAlternativeString() {
        assertEquals("HELLO WORLD", Task17.toAlternativeString("hello world"));
        assertEquals("hello world", Task17.toAlternativeString("HELLO WORLD"));
        assertEquals("привіт", Task17.toAlternativeString("ПРИВІТ"));
        assertEquals("!@#$%", Task17.toAlternativeString("!@#$%"));
        assertEquals("Hello World", Task17.toAlternativeString(Task17.toAlternativeString("Hello World")));
        assertEquals("12345", Task17.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", Task17.toAlternativeString("1a2b3c4d5e"));
    }

    @Test
    public void TestToAlternativeString2() {
        assertEquals("ALTerNAtiNG CaSe", Task17.toAlternativeString("altERnaTIng cAsE"));
        assertEquals("altERnaTIng cAsE", Task17.toAlternativeString("ALTerNAtiNG CaSe"));
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", Task17.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe"));
        assertEquals("altERnaTIng cAsE <=> ALTerNAtiNG CaSe", Task17.toAlternativeString("ALTerNAtiNG CaSe <=> altERnaTIng cAsE"));
    }
}
