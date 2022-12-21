package com.epam.tasks.arrays.sorter;

import java.util.Arrays;

/**
 * <p>
 * This class contains a method that are used with String arrays. The arguments of type string is converted
 * to an integer array from the named base, in order to sort the arguments of an array and return it sorted
 * in ascending order.
 * </p>
 *
 * @author Lizeth Pulido Davila
 * @version 1.0
 */
public class Sorter {
    /**
     * <p>
     * This method converts the string array into an integer array and sorts their arguments in the ascending order.
     * </p>
     *
     * @param args is the array parameter to be sorted.
     * @return an integer array sorted in ascending order.
     * @throws IllegalArgumentException  If the String array has no arguments.
     * @throws IndexOutOfBoundsException If the index of the String array arguments is greater than the length of 10.
     */
    public static int[] sortArray(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("There are not arguments");
        } else if (args.length > 10) {
            throw new IndexOutOfBoundsException("This app takes up to ten command-line arguments ");
        }
        /**
         * <p>
         * The array contains the integer values took from the String arguments.
         * </p>
         */
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(array);
        return array;
    }
}
