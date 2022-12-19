package org.emrb;

import java.util.Arrays;

public class SortingApp {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.sorter(args);
        System.out.println(Arrays.toString(args));
    }

}
