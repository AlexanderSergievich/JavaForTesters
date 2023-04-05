package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatsTernaryTest {
    @Test
    public  void catsCalculation(){
        assertEquals("1 == cat", "cat", catOrCats(1));
        assertEquals("0 == cats", "cats", catOrCats(0));
        assertEquals("2 == cats", "cats", catOrCats(2));

    }
    public  String catOrCats(int numberOfCats){
        return (numberOfCats == 1) ? "cat" : "cats";
    }
}
