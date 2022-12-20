package org.example;


import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MoreThanTenTest {

    private App app = new App();
    private String[] values;

    public MoreThanTenTest(String[] values){
        this.values = values;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {new String[]{"10", "1", "33", "29", "45", "111", "13", "16", "8", "65", "41"}},
                {new String[]{"10", "23", "2", "65", "37", "97", "22", "25", "65", "32", "76", "34", "73", "98", "43", "13", "4","40", "1"}},
                {new String[]{"33", "4", "35", "54", "51", "1031", "997", "533", "545", "127", "247"}},
                {new String[]{"10", "1", "3", "2", "4", "11", "13", "9", "55", "76", "98"}},
                {new String[]{"4", "1", "33", "29", "49", "45", "101", "431", "567", "305", "127"}},
                {new String[]{"6", "6", "33", "529", "78", "111", "13", "765", "833", "652", "6764","45"}},
                {new String[]{"13", "7", "789", "29", "356", "89", "34", "31", "67", "89", "90", "371"}}
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThanTen(){app.main(values);}


}
