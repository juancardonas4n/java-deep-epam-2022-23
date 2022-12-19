package com.epam.rd.autotasks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NominalValueSimpleSortTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    private final String[] args;
    private final String expected;

    public NominalValueSimpleSortTest(String[] args, String expected) {
        this.args = args;
        this.expected = expected;
    }

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSimpleSort() {
        SimpleSort.main(args);
        assertEquals(expected, outContent.toString().trim());
    }

    @Parameters
    public static Collection<Object[]> parameterData() {
        return Arrays.asList(new Object[][] {
                {new String[]{"1","2","3"},"1 2 3"},
                {new String[]{"3","2","1"},"1 2 3"},
                {new String[]{"3","1","2","3"},"1 2 3 3"},
                {new String[]{"3","2","1","1"},"1 1 2 3"},
                {new String[]{"0","100","-100"},"-100 0 100"},
                {new String[]{"67","17","97","13","53"},"13 17 53 67 97"},
                {new String[]{"-67","17","-97","13","-53","71"},"-97 -67 -53 13 17 71"}
        });
    }

}