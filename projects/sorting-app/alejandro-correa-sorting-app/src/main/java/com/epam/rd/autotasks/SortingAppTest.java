package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SortingAppTest {

    protected SortingApp sortingApp = new SortingApp();
    private ArrayList<String> input;
    private ArrayList<Integer> expected;

    public SortingAppTest(ArrayList<String> input, ArrayList<Integer> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new ArrayList<>(Arrays.asList("2", "1")), new ArrayList<>(Arrays.asList(1, 2))},
                {new ArrayList<>(Arrays.asList("3", "2", "1")), new ArrayList<>(Arrays.asList(1, 2, 3))},
                {new ArrayList<>(), new ArrayList<>()},
                {new ArrayList<>(Arrays.asList("1")), new ArrayList<>(Arrays.asList(1))},
                {new ArrayList<>(Arrays.asList("3", "2","", "1")), new ArrayList<>(Arrays.asList(1, 2, 3))},
                {new ArrayList<>(Arrays.asList("3", "2","a", "1")), new ArrayList<>(Arrays.asList(1, 2, 3))},
                {new ArrayList<>(Arrays.asList("3", "2","f", "1")), new ArrayList<>(Arrays.asList(2, 3))},
                {new ArrayList<>(Arrays.asList("f", "2","3", "1")), new ArrayList<>()},
                {new ArrayList<>(Arrays.asList("2","1","3", "4", "5", "6", "7", "8", "9", "10", "11")), new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10))},
                {new ArrayList<>(Arrays.asList("3.2", "2","a", "1")), new ArrayList<>(Arrays.asList(1, 2))},
        });
    }

    @Test
    public void sortingAppTest() {
        StringBuilder sb = new StringBuilder();
        for (String e : input) sb.append(e).append(System.getProperty("line.separator"));
        System.setIn(new ByteArrayInputStream(sb.toString().getBytes()));
        sortingApp.populateList();
        sortingApp.sort();
        Assert.assertEquals(expected, sortingApp.getList());
    }
}