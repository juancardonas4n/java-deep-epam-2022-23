package com.karen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class for sorting a list of integers in ascending order.
 * @author Karen Urbano
 * @since 1.0
 */
public class Sorting {
    /**
     * List of integers to be sorted.
     */
    private List<Integer> numbers;

    /**
     * Sorts a list of integers in ascending order.
     * @param args list of strings to be converted to Integers and sorted
     */
    public void sort(List<String> args) {
        List<Integer> numbers = new ArrayList<>();

        if( args.size() >= 1 && args.size() <= 10 ){
            for (String arg : args) {
                try {
                    int number = Integer.parseInt(arg);
                    if (number >= 0) {
                        numbers.add(number);
                    }
                } catch (NumberFormatException e) {
                    // if the arg is not a number, we just skip it
                }
            }
        }

        Collections.sort(numbers);
        this.numbers = numbers;
    }

    /**
     * Returns the sorted list of numbers.
     * @return sorted list of numbers
     */
    public List<Integer> getNumbers() {
        return numbers;
    }
}
