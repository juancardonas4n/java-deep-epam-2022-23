package org.example;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AppParametizedTest {
    private final String args;
    private final String expected;

    public AppParametizedTest(String args, String expected) {
        this.args = args;
        this.expected = expected;
    }

    @Test
    public void testParametized() {
        // Setup
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        String[] array = args.split(" ");

        // Execute
        App.main(array);
        String outputStr = byteArrayOutputStream.toString().trim();

        // Test
        assertEquals(expected, outputStr);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"4 3 2 1", "1 2 3 4"},
                {"3 1 2", "1 2 3"},
                {"1 2 3 7 12 1 4 0", "0 1 1 2 3 4 7 12"},
                {"-3 4 -9 1 -4 0", "-9 -4 -3 0 1 4"}
        });
    }
}