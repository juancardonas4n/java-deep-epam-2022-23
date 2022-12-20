package com.karen;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SortingTest {
    private Sorting sorting;
    private List<Integer> expected;
    private List<String> args;

    public SortingTest(List<String> args, List<Integer> expected) {
        this.args = args;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(new Object[][] {
                { Arrays.asList("1", "-10", "5", "3"), Arrays.asList(1, 3, 5) },//negative numbers are ignored
                { Arrays.asList("1", "10","cow", "5", "3"), Arrays.asList(1, 3, 5, 10) },//no numbers strings are ignored
                //CORNER CASES TEST
                { Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) },
                { Arrays.asList("10", "9", "8", "7", "6", "5", "4", "3", "2", "1"), Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) },//with ten args
                { Arrays.asList("1"), Arrays.asList(1) },                                                //with 1 arg
                { Arrays.asList(), Arrays.asList() },                                                    //with 0 args
                { Arrays.asList("11","8","7","9","10","6","1","4","3","2","5"), Arrays.asList()}         //with 11 args. If there is more than 10 inputs, the program don't sort the data
        });
    }

    @Test
    public void testSort() {
        sorting = new Sorting();
        sorting.sort(args);
        assertEquals(expected, sorting.getNumbers());
    }
}
