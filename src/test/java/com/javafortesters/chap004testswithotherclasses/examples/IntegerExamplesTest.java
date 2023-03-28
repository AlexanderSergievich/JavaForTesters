package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void integerExploration(){
        Integer four = Integer.valueOf(5);
        assertEquals("intValue returns int 5", "5", four.toString());
    }

    @Test
    public void HexExploration(){
        String five = Integer.toHexString(11);
        assertEquals("Hex equals b", "b", five);
    }
}
