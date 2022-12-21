package com.epam.tasks;

import com.epam.tasks.arrays.sorter.Sorter;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortingAppParameterizedTest {
    private String[] arguments;
    private int[] expected;

    public SortingAppParameterizedTest(String[] arguments, int[] expected) {
        this.arguments = arguments;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> casesParameters() {
        return Arrays.asList(new Object[][]{
                {new String[]{"2", "10", "4", "8", "9", "1", "5", "3", "6", "7"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}},
                {new String[]{"20", "2", "18", "4", "6", "16", "10", "8", "14", "12"}, new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}},
                {new String[]{"5", "50", "6", "51", "8", "10", "28", "32", "4", "9"}, new int[]{4, 5, 6, 8, 9, 10, 28, 32, 50, 51}},
                {new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}}
        });
    }

    @Test
    public void testTenArguments() {
        Assert.assertArrayEquals(expected, Sorter.sortArray(arguments));
    }
}
