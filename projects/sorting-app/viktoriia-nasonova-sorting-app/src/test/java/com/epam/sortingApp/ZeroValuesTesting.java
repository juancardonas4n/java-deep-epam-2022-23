package com.epam.sortingApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ZeroValuesTesting
{
    SortingApp sortingApp = new SortingApp();

    String expected;

    public ZeroValuesTesting(String expected) {
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> sortingApp() {
        return Arrays.asList(new Object[][]{
                {"[]"}

        });
    }
    @Test
    public void testZeroValues()
    {
        String[] args = new String[0];
        assertEquals(expected,sortingApp.sortValues(args));
    }
}
