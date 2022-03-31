package Conditions;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;



public class TestTask24 {

    @Test
    public void exampleTestTask24(){
        assertThat(Task24.basicMath("+",3,5),is(8));
        assertThat(Task24.basicMath("-", 15, 18), is(-3));
        assertThat(Task24.basicMath("*", 5, 5), is(25));
        assertThat(Task24.basicMath("/", 49, 7), is(7));
    }



}
