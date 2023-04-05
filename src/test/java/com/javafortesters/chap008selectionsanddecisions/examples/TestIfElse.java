package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestIfElse {
    @Test
    public void assertTruethy() {
        boolean truthy = false;
        if (truthy) assertTrue(truthy);
        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
        }
    @Test
    public void nestedIfs(){
    boolean truthy = false;
    boolean falsey = false;
    if(!falsey){
        if (truthy && !falsey){
            if (falsey || truthy){
                assertFalse(falsey);
                assertTrue(truthy);
            }
            else{
                assertTrue(falsey);
                assertTrue(truthy);
            }
        }else{
            if (!truthy){
                if (falsey){
                    assertTrue(falsey);
                    assertFalse(truthy);
                }else{
                    assertFalse(truthy);
                    assertFalse(falsey);
                }
           }
        }
    }
    }
}
