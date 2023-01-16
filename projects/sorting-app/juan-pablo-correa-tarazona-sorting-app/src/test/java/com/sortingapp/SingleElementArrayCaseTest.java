package com.sortingapp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SingleElementArrayCaseTest {
    
    private String input;
    private String expected;

    public SingleElementArrayCaseTest(String expected, String input) {
        this.expected = expected;
        this.input = input;
    }

    @Test
    public void testSingleElementCase() {
        String[] in = new String[]{input};
        App.main(in);
        assertEquals(expected, in[0]);
    }

    
    /** 
     * @return Collection<Object[]>
     */
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {"1", "1"},
            {"2","2"},
            {"-5","-5"}
        };
        return Arrays.asList(data);
    }
}
