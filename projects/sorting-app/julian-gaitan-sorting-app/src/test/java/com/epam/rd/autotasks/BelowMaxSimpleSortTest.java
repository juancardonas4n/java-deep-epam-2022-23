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
public class BelowMaxSimpleSortTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    private final String[] args;
    private final String expected;

    public BelowMaxSimpleSortTest(String[] args, String expected) {
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
                {new String[]{"1","2","3","4","5","6","7","8","9"},"1 2 3 4 5 6 7 8 9"},
                {new String[]{"8","7","6","5","4","3","2","1","0"},"0 1 2 3 4 5 6 7 8"},
                {new String[]{"1","1","3","3","5","5","7","7","9"},"1 1 3 3 5 5 7 7 9"},
                {new String[]{"8","8","8","8","8","8","8","8","0"},"0 8 8 8 8 8 8 8 8"},
                {new String[]{"0","10","-10", "100","-100","1000","-1000","10000","-10000"},"-10000 -1000 -100 -10 0 10 100 1000 10000"},
                {new String[]{"67","17","97","13","53","12","48","24","76"},"12 13 17 24 48 53 67 76 97"},
                {new String[]{"-67","17","-97","13","-53","71","-12","48","-24"},"-97 -67 -53 -24 -12 13 17 48 71"}
        });
    }

}