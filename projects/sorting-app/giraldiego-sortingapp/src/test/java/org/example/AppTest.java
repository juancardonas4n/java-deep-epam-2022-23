package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import org.apache.commons.io.output.ByteArrayOutputStream;

import java.io.PrintStream;

public class AppTest
{
    @Test
    public void testCaseZeroArguments() {
        // Setup
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        String[] array = {};
        String expected = "Invalid argument quantity, MIN=1 MAX=10";

        // Execute
        App.main(array);
        String outputStr = byteArrayOutputStream.toString().trim();

        // Test
        assertEquals(expected, outputStr);
    }

    @Test
    public void testCaseOneArgument() {
        // Setup
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        String[] array = {"99"};
        String expected = "99";

        // Execute
        App.main(array);
        String outputStr = byteArrayOutputStream.toString().trim();

        // Test
        assertEquals(expected, outputStr);
    }

    @Test
    public void testCase10() {
        // Setup
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        String[] array = {"9", "0", "1", "3", "4", "2", "5", "6", "7", "8"};
        String expected = "0 1 2 3 4 5 6 7 8 9";

        // Execute
        App.main(array);
        String outputStr = byteArrayOutputStream.toString().trim();

        // Test
        assertEquals(expected, outputStr);
    }

    @Test
    public void testCaseMoreThan10() {
        // Setup
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        String[] array = {"9", "0", "1", "3", "4", "2", "5", "6", "7", "8", "10"};
        String expected = "Invalid argument quantity, MIN=1 MAX=10";

        // Execute
        App.main(array);
        String outputStr = byteArrayOutputStream.toString().trim();

        // Test
        assertEquals(expected, outputStr);
    }

}

