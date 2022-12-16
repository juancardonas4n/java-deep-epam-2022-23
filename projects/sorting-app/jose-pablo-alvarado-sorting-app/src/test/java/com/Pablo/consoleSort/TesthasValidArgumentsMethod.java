package com.Pablo.consoleSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;

public class TesthasValidArgumentsMethod {

    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void testNullArgument() {
        assertFalse("Arguments should Not be null",App.hasValidArguments(null));
    }

    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void testLessThan1Argument(){
        assertFalse("App shouldn't accept zero (console) arguments", App.hasValidArguments(new String[0]));
    }

    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void testMoreThan10Arguments(){
        String[] arguments = new String[11];
        Arrays.fill(arguments, "5");

        assertFalse("App shouldn't accept 11 or more (console) arguments", App.hasValidArguments(arguments));
    }

    //@Test(expected = IllegalArgumentException.class)
    @Test
    public void testShouldHaveOnlyIntegersArguments(){
        String[] arguments = {"0.0", "1.97", "pi", ".5", "notaNumber", " "};
        assertFalse("Should only accept positive and negative integers with no decimal point", App.hasValidArguments(arguments));
    }

}
