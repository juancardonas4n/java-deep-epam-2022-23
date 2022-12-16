package com.Pablo.consoleSort;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestValidArguments {

    @Parameterized.Parameters(name = "test#{index}: expected {1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new String[]{"247"}, "{247}"}, // minimum 1 valid argument
                { new String[]{"50","1"}, "{1,50}"}, // just above minimum 2 valid arguments
                { new String[]{"-5","10","23","-48","1800","0","1","-1000","127","333"}, "{-1000,-48,-5,0,1,10,23,127,333,1800}"}, // maximum 10 valid arguments
                { new String[]{"-1","0","2","4","5","1","10","8","9"}, "{-1,0,1,2,4,5,8,9,10}"}, // just below maximum 9 valid arguments
                { new String[]{"-5","1","0","5","3"}, "{-5,0,1,3,5}"}, // ¿nominal  5 valid arguments
                { new String[]{"-3","-4","-8","-5"}, "{-8,-5,-4,-3}"}, // only negative numbers
                { new String[]{"0","0","0","0"}, "{0,0,0,0}"}, // only arguments of value 0
                { new String[]{"2","2","-4","-4","0","0"}, "{-4,-4,0,0,2,2}"}, // repetitive numbers
        });
    }

    private final String[] input;
    private final String expected;

    public TestValidArguments(String[] input, String expected) {
        this.input = input;
        this.expected = "Sorted numbers: " + expected;
    }

    @Test
    public void testRegularCases() {
        final ByteArrayOutputStream temporalOut = new ByteArrayOutputStream();
        final PrintStream originalOut = System.out;
        System.setOut(new PrintStream(temporalOut));

        App.main(input);
        String result = temporalOut.toString().trim();

        Assert.assertTrue(result.equalsIgnoreCase(expected));

        System.setOut(originalOut);

    }
}
