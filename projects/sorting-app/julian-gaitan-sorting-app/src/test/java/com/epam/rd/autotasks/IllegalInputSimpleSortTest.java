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
public class IllegalInputSimpleSortTest {

    private final String[] args;

    public IllegalInputSimpleSortTest(String[] args) {
        this.args = args;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSort() {
        SimpleSort.main(args);
    }

    @Parameters
    public static Collection<Object[]> parameterData() {
        return Arrays.asList(new Object[][] {
                {new String[]{"A"}},
                {new String[]{"1"," "}},
                {new String[]{"-10","10","10-5"}},
                {new String[]{"5","25","Hello!","0"}},
                {new String[]{"100","10l","102"}},
        });
    }

}