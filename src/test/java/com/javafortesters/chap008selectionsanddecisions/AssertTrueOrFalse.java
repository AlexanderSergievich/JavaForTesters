package com.javafortesters.chap008selectionsanddecisions;

import org.junit.Assert;
import org.junit.Test;

public class AssertTrueOrFalse {
    @Test
    public void assertTrurthy() {
        boolean truthy = true;
        if (truthy == true) Assert.assertTrue(truthy);

    }
}
