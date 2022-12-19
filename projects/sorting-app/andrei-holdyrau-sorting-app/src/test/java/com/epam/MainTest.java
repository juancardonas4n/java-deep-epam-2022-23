package com.epam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MainTest {
    private String[] args;
    private String[] expected;

    public MainTest(String[] args, String[] expected) {
        this.args = args;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(
                new String[][][]{
                        {{"1", "1", "1", "1"}, {"1", "1", "1", "1"}},
                        {{"5", "4", "3", "2", "1"}, {"1", "2", "3", "4", "5"}},
                        {{"0", "-5", "8", "3"}, {"-5", "0", "3", "8"}},
                        {{"10"}, {"10"}},
                        {{"1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}}
                }
        );
    }

    @Test
    public void emptyCase() {
        testTemlate("At least one argument is required", new String[0]);
    }

    @Test
    public void moreThanMaxCase() {
        String[] args = {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"};
        testTemlate("Max number of arguments is 10", args);
    }

    @Test
    public void notAnIntegerCase() {
        String[] args = {"1", "1", "1", "1", "1", "bro"};
        testTemlate("All arguments should be integers", args);
    }

    @Test
    public void testSortedArraysCase() {
        testTemlate(Arrays.toString(expected), args);
    }

    private void testTemlate(String result, String[] in) {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        System.setOut(printStream);
        PrintStream defaultOut = System.out;

        try {
            Main.main(in);
            printStream.flush();
            String actual = out.toString().trim();
            assertEquals(result, actual);
        } finally {
            System.setOut(defaultOut);
        }
    }
}