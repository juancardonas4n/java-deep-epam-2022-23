package org.example;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestCasesEmpty {


    private App app = new App();
    private String[] values;

    public TestCasesEmpty(String[] values){
        this.values = values;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new String[]{}},
                {new String[0]}
        });
    }


    @Test(expected = IllegalArgumentException.class)
    public void testEmpty()
    {
        App.main(values);
    }

}
