package com.epam;

/**
 * This class sorts an array of integers in the ascending order.
 */

public class Sorting {
    /**
     * This method sorts an array of integers in the ascending order
     * @param array array to be sorted
     * @throws IllegalArgumentException if array == null, array.length == 0, array.length > 10
     */
    public void sort (int[] array){
        if(array == null){
            throw new IllegalArgumentException();
        }

        if (array.length == 0){
            throw new IllegalArgumentException("At least one argument is required");
        }

        if (array.length > 10){
            throw new IllegalArgumentException("Max number of elements is 10");
        }

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
