package com.javafortesters.chap008selectionsanddecisions;

import org.junit.Test;


public SwitchExample{
    @Test
    public void checkingTheCode(){
        assertEquals("United Kingdom",switchMethod("UK"));
        assertEquals("United states",switchMethod("US"));
        assertEquals("United states",switchMethod("USA"));
        assertEquals("France",switchMethod("FR"));
        assertEquals("Sweden",switchMethod("SE"));
    }
    public switchMethod(String title ) {
        String countryCode;
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
        return countryCode;
    }
}
