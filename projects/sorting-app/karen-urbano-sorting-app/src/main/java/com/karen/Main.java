package com.karen;

import java.util.Arrays;
import java.util.List;

/**
 * Main class to run the program
 */
public class Main {
    /**
     * Main class
     * @param args array of strings that stores java command line arguments
     */
    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.sort(Arrays.asList(args));
        List<Integer> sortedNumbers = sorting.getNumbers();

        for (int number : sortedNumbers) {
            System.out.println(number);
        }
    }
}
