package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SwitchExample{
    @Test
    public void checkingTheCode(){
        assertEquals("United Kingdom",switchMethod("UK"));
        assertEquals("United states",switchMethod("US"));
        assertEquals("United states",switchMethod("USA"));
        assertEquals("France",switchMethod("FR"));
        assertEquals("Sweden",switchMethod("SE"));

    }
    public String switchMethod(String strangeThings) {
        String countryCode;
        switch (strangeThings.toUpperCase()) {
            case "UK":
                countryCode = "United Kingdom";
                break;
            case "US":
                countryCode = "United states";
                break;
            case "USA":
                countryCode = "United states";
                break;
            case "FR":
                countryCode = "France";
                break;
            case "SE":
                countryCode = "Sweden";
                break;
            default:
                countryCode = "Rest Of World";
        }
        return countryCode;
    }
}
