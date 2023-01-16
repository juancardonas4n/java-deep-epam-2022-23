package com.sortingapp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RegularCaseTest {
    
    private String input;
    private String expected;

    public RegularCaseTest(String expected, String input) {
        this.expected = expected;
        this.input = input;
    }

    @Test
    public void testRegularCase() {
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
            {"0 1 2 3 4 5 6 7 8 9", "9 8 7 6 5 4 3 2 1 0"},
            {"1 2 3 5 5 6 8 9 12 41","5 8 9 3 1 12 41 5 6 2"},
            {"-52 -5 -3 -2 1 12 25 41 52 110","12 41 25 110 52 1 -5 -2 -52 -3"}
        };
        return Arrays.asList(data);
    }
}
