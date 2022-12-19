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
import static org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MinBoundarySimpleSortTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    private final String[] args;
    private final String expected;

    public MinBoundarySimpleSortTest(String[] args, String expected) {
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
                {new String[]{},""}
        });
    }

}