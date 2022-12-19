package org.emrb;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for Sorting App.
 */

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sorter(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void largeArray() {
        String[] arr = {"3", "4", "7", "2", "3", "4", "12", "9", "1245", "-1", "15"};
        sorting.sorter(arr);
    }

    @Test
    public void testEmptyCase() {
        String[] emptyArray = new String[]{};
        sorting.sorter(emptyArray);
        assertArrayEquals(new String[]{}, emptyArray);
    }

    @Test
    public void testSingleElementArrayCase() {
        String[] singleElementArray = new String[]{"10"};
        sorting.sorter(singleElementArray);
        assertArrayEquals(new String[]{"10"}, singleElementArray);
    }

    @Test
    public void testSortedArraysCase() {
        String[] sortedArray = new String[]{"10", "3", "15", "1", "4", "2", "13"};
        sorting.sorter(sortedArray);
        assertArrayEquals(new String[]{"1", "2", "3", "4", "10", "13", "15"}, sortedArray);
    }

    /**
     * Rigourous Test
     */
    @Test
    public void testOtherCases() {
        String[] sortedArray1 = new String[]{"10", "3", "15", "1", "4", "2", "13"};
        String[] sortedArray2 = new String[]{"10", "5", "15", "1", "4", "2", "13"};
        String[] sortedArray3 = new String[]{"10", "3", "15", "6", "4", "2", "13"};
        String[] sortedArray4 = new String[]{"10", "3", "15", "1", "4", "7", "13"};
        String[] sortedArray5 = new String[]{"10", "0", "15", "1", "4", "2", "-13"};
        sorting.sorter(sortedArray1);
        assertArrayEquals(new String[]{"1", "2", "3", "4", "10", "13", "15"}, sortedArray1);
        sorting.sorter(sortedArray2);
        assertArrayEquals(new String[]{"1", "2", "4", "5", "10", "13", "15"}, sortedArray2);
        sorting.sorter(sortedArray3);
        assertArrayEquals(new String[]{"2", "3", "4", "6", "10", "13", "15"}, sortedArray3);
        sorting.sorter(sortedArray4);
        assertArrayEquals(new String[]{"1", "3", "4", "7", "10", "13", "15"}, sortedArray4);
        sorting.sorter(sortedArray5);
        assertArrayEquals(new String[]{"-13", "0", "1", "2", "4", "10", "15"}, sortedArray5);
    }
}
