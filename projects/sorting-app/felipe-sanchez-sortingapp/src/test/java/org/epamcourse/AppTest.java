package org.epamcourse;

import static org.junit.Assert.assertArrayEquals;

import org.epamcourse.parser.IntegerParser;
import org.epamcourse.sorter.Sorter;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class AppTest 
{

    @Test
    public void testNormalShortArrayfromTestCaseFirst(){
        Integer []expected=new Integer []{1,2,11,22,25,84};
        String []args=new String[]{"11","1","2","84","22","25"};
        Integer []integers= IntegerParser.parseStrings(args);
        Sorter.sort(integers);
        assertArrayEquals(integers,expected);
    }


    @Test
    public void testSortingIntegers(){

            Integer []expected=new Integer []{1,4,8,85,210,690,1000};
            Integer []intialArray=new Integer[]{1,4,690,85,210,8,1000};
            Sorter.sort(intialArray);
            assertArrayEquals(intialArray,expected);

    }



    @Test
    public void testSortingIntegersWithNegativeValues(){

        Integer []expected=new Integer []{-1000,-1,4,8,85,210,690};
        Integer []intialArray=new Integer[]{-1,4,690,85,210,8,-1000};
        Sorter.sort(intialArray);
        assertArrayEquals(intialArray,expected);

    }

    @Test(expected = ClassCastException.class)
    public void testExceptionByNonComparableObjects(){
        Object[] objects=new Object[]{new Object(),new Object()};
        Sorter.sort(objects);


        }
}
