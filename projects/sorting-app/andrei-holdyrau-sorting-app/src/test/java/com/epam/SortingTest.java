package com.epam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SortingTest {
    Sorting sorting = new Sorting();
    private int[] args;
    private int[] expected;

    public SortingTest(int[] args, int[] expected) {
        this.args = args;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(
                new int[][][]{
                        {{1,1,1,1},{1,1,1,1}},
                        {{5,4,3,2,1},{1,2,3,4,5}},
                        {{0,-5,8,3},{-5,0,3,8}},
                        {{10},{10}}
                }
        );
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        sorting.sort(null);

    }
    @Test(expected = IllegalArgumentException.class)
        public void emptyCase () {
            sorting.sort(new int[0]);
        }

    @Test
    public void testSortedArraysCase() {
        sorting.sort(args);
        assertArrayEquals(expected,args);
    }
}