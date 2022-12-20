package com.epam.SortingApp;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SortingAppTest {
    SortingApp sorting = new SortingApp();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        sorting.sortingApp(null);

    }

    @Test
    public void testEmptyCase() throws UnsupportedEncodingException {
        String[] emptyArray = {};


       final ByteArrayOutputStream out = new ByteArrayOutputStream();
       PrintStream  controlledOut = new PrintStream(out);
       PrintStream  defaultOut = System.out;

       try{
           System.setOut(controlledOut);
           sorting.sortingApp(emptyArray);
            controlledOut.flush();
            assertEquals("[]",out.toString("UTF-8").trim());
       }finally {
           System.setOut(defaultOut);
       }
    }

    @Test
    public void testSingleArgumentCase() throws UnsupportedEncodingException {
        String[] emptyArray = {"5"};


        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream  controlledOut = new PrintStream(out);
        PrintStream  defaultOut = System.out;

        try{
            System.setOut(controlledOut);
            sorting.sortingApp(emptyArray);
            controlledOut.flush();
            assertEquals("[5]",out.toString("UTF-8").trim());
        }finally {
            System.setOut(defaultOut);
        }
    }

    @Test
    public void testTenArgumentsCase() throws UnsupportedEncodingException {
        String[] emptyArray = {"5","3","1","2","6","-1","-13","0","12","10"};


        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream  controlledOut = new PrintStream(out);
        PrintStream  defaultOut = System.out;

        try{
            System.setOut(controlledOut);
            sorting.sortingApp(emptyArray);
            controlledOut.flush();
            assertEquals("[-13, -1, 0, 1, 2, 3, 5, 6, 10, 12]",out.toString("UTF-8").trim());
        }finally {
            System.setOut(defaultOut);
        }
    }
    @Test (expected = IllegalArgumentException.class)
    public void testMoreThanTenArgumentsCase(){
        String[] emptyArray = {"5","3","1","2","6","-1","-13","0","12","10","23","25","56"};
        sorting.sortingApp(emptyArray);
    }

    @Test
    @Parameters(method = "parametersToParamTest")
    public void paramTest(String[] values, String expected) throws UnsupportedEncodingException {

        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream  controlledOut = new PrintStream(out);
        PrintStream  defaultOut = System.out;

        try{
            System.setOut(controlledOut);
            sorting.sortingApp(values);
            controlledOut.flush();
            assertEquals(expected,out.toString("UTF-8").trim());
        }finally {
            System.setOut(defaultOut);
        }
    }

    private Object[] parametersToParamTest(){
        return new  Object[]{
                new Object[]{new String[]{"3","2","1"},"[1, 2, 3]"},
                new Object[]{new String[]{"-1","-4","-6","-34","-234","-10","-45","-23"},"[-234, -45, -34, -23, -10, -6, -4, -1]"},
                new Object[]{new String[]{"23","37","12","-6","-34","-123","-678","45","-12","35"},"[-678, -123, -34, -12, -6, 12, 23, 35, 37, 45]"},
                new Object[]{new String[]{"6"},"[6]"},
                new Object[]{new String[]{"65","78","98","-32","-26","-67"},"[-67, -32, -26, 65, 78, 98]"}
        };
    }
}
