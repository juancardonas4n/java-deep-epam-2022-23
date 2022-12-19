package com.epam.rd.appsorting;

import com.epam.rd.appsorting.Sorting;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 *
 *This class is for testing the corner cases
 *
 * @author daniel anaya murcia
 * @version 1.0.0
 */
public class SortingTest {

    /**
     *Check the exception for null arguments
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
      Sorting.sort(new String[]{null});
    }

    /**
     *Check the exception for empty arguments
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyCase(){
        Sorting.sort(new String[]{});
    }

    /**
     *Check the exception for more than ten arguments
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void testMoreThanTenElementsArrayCase() {
        Sorting.sort(new String[]{"1","3","5","2","18","7","4","-7","15","16","11"});

    }

    /**
     *Check the case for just one argument
     *
     */
    @Test
    public void testSingleElementArrayCase() {
        int[]array=new int[]{1};
        assertArrayEquals(array, Sorting.sort(new String[]{"1"}));
    }

    /**
     *Check if the code is doing the sorting for a valid arguments input.
     *
     */
    @Test
    public void testSortedArraysCase() {
        int[]array=new int[]{1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(array,Sorting.sort(new String[]{"1","3","5","2","6","7","4","8","9","10"}));

    }

}