package com.epam.rd.appsorting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

/**
 *This class is for test the code with parametrized arguments
 *
 * @author daniel anaya murcia
 * @version 1.0.0
 *
 */
@RunWith(Parameterized.class)
public class SortingparametrizedTest {
    private String[]input;
    private int[]expected;
    private Sorting sorting;

    /**
     *
     * This is a construct method where we define input and expected array for the test
     *
     * @param input Array of strings
     * @param expected Array of integers that is expected
     */

    public SortingparametrizedTest (String[]input,int[]expected){
    super();
    this.expected=expected;
    this.input=input;
    }

    /**
     *This is for instance the object before using it in the test
     *
     */
    @Before
    public void initialize(){
        sorting=new Sorting();
    }

    /**
     *This method create the parametrized data as a dimensional array object.
     *
     * @return  a fixed-size list backed by the specified array
     */
    @Parameterized.Parameters
    public static Iterable<Object[]> testData() {

        Object[][] data = new Object[][]{
                {new String[]{"4","2","3","1"}, new int[] {1,2,3,4} },
                {new String[]{"1"}, new int[] {1}},
                {new String[]{"1","3","5","2","6","7","4","8","9","10"}, new int[] {1,2,3,4,5,6,7,8,9,10} }

        };
        return Arrays.asList(data);

    }

    /**
     *Check that the array of integers we expected is equal to the array after the sort.
     *
     */
    @Test
    public void testParametrizedSorting() {
        assertArrayEquals(expected,sorting.sort(input));
    }


}