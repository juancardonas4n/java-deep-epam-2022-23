package com.sortingapp;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MoreThanTenCaseTest {
    
    private String input;    

    public MoreThanTenCaseTest(String input) {
        this.input = input;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegularCase() {
        String[] in = new String[]{input};
        App.main(in);
    }

    
    /** 
     * @return Collection<Object[]>
     */
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {"0 1 2 3 4 5 6 7 8 9 1 1"},
            {"1 2 3 5 5 6 8 9 12 41 1 1"},
            {"-52 -5 -3 -2 1 12 25 41 52 110 1 1"}
        };
        return Arrays.asList(data);
    }
}
