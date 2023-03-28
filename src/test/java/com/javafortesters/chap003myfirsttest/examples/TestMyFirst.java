package com.javafortesters.chap003myfirsttest.examples;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyFirst {
    @Test
    public void CanAdd2Plus2(){
    int answer = 2+2;
    assertEquals("2+2=4",4, answer );
    }
    @Test
    public void CanDevide(){
        int quastion = 4/2;
        assertEquals("4/2 = 2",2, quastion);
    }
}

