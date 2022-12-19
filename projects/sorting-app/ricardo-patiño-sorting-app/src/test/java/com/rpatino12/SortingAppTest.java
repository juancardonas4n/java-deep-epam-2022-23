package com.rpatino12;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SortingAppTest {
    protected App sorting = new App();

    private Integer[] inputNumbers;
    private Integer[] expectedNumbers;

    /**
     * Create the test case with the parameterized tests
     *
     * @param numbers Integer array of numbers given by the user
     * @param expected Integer array of expected sorted numbers
     */
    public SortingAppTest(Integer[] numbers, Integer[] expected) {
        this.inputNumbers = numbers;
        this.expectedNumbers = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases(){
        return Arrays.asList(new Integer[][][]{
                {{}, {}},
                {{5}, {5}},
                {{3, 2, 1, 0, -2}, {-2, 0, 1, 2, 3}},
                {{3, 2, 1, 0, -2, 11, 4, 5, -7, 20}, {-7, -2, 0, 1, 2, 3, 4, 5, 11, 20}}
        });
    }

    /**
     * Test for the corner cases with zero, one, five and ten arguments
     */
    @Test
    public void sortNumbers() {
        assertEquals(parseArray(expectedNumbers), sorting.sortNumbers(inputNumbers));
    }

    /**
     * Function to parse the expected array to String
     *
     * @param array Integer array of numbers
     */
    private String parseArray(final Integer[] array) {
        String stringArray = Arrays.toString(array);
        return stringArray.replaceAll("[^\\d||\\s||-]", "");
    }
}