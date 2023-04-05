package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestSwitch {
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
    /*Create a method which uses a switch statement to return a String representing the int passed in as a
parameter to the method:
given 1 return "One"
given 2 return "Two"
given 3 return "Three"
given 4 return "Four"
givenaninteger> 4,return"Too big" givenaninteger< 1,return"Too small" */
    @Test
    public void testInt(String arg){
        assertEquals("One",returnStringByCondition(1));
        assertEquals("Two",returnStringByCondition(2));
        assertEquals("Three",returnStringByCondition(3));
        assertEquals("Four",returnStringByCondition(4));
        assertEquals("Too small",returnStringByCondition(0));
        assertEquals("Too big",returnStringByCondition(6));
    }
    public String returnStringByCondition(int number){
        String reusedInt = null;
        switch(number){
            case 1:
                reusedInt = "One";
                break;
            case 2:
                reusedInt = "Two";
                break;
            case 3:
                reusedInt = "Three";
                break;
            case 4:
                reusedInt = "Four";
            default:
                if(number>4) {
                    reusedInt = "Too big";}
                    else if(number<1){
                        reusedInt = "Too small";
                    }
                }
                return reusedInt;
    }
}
