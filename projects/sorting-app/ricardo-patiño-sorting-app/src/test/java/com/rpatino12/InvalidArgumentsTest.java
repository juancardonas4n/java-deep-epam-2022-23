package com.rpatino12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class InvalidArgumentsTest {
    protected App sorting = new App();

    private Integer[] inputNumbers;
    private Integer[] expectedNumbers;

    /**
     * Create the test case with the parameterized tests
     *
     * @param numbers Integer array of numbers given by the user
     * @param expected Integer array of expected sorted numbers
     */
    public InvalidArgumentsTest(Integer[] numbers, Integer[] expected) {
        this.inputNumbers = numbers;
        this.expectedNumbers = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Integer[][][]{
                {{3, 2, 1, 0, -2, 11, 4, 5, -7, 20, -12}, {-12, -7, -2, 0, 1, 2, 3, 4, 5, 11, 20}},
                {{3, 2, 1, 0, -2, 11, 4, 5, -7, 20, -12, 21}, {-12, -7, -2, 0, 1, 2, 3, 4, 5, 11, 20, 21}},
                {{3, 2, 1, 0, -2, 11, 4, 5, -7, 20, -12, 21, 24, 30}, {-12, -7, -2, 0, 1, 2, 3, 4, 5, 11, 20, 21, 24, 30}}
        });
    }

    /**
     * Test for the corner cases with more than ten arguments, expects an Exception
     */
    @Test (expected = IllegalArgumentException.class)
    public void sortNumbers() {
        sorting.sortNumbers(inputNumbers);
    }
}