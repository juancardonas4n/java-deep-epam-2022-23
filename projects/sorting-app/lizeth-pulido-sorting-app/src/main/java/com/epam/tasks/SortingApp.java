/**
 * This is the core package for the application
 */
package com.epam.tasks;

import com.epam.tasks.arrays.sorter.Sorter;

/**
 * This class are used with String arrays converted into an integer array which is sorted by the sortArray
 * method from the Sorter class then prints each value of the array into standard output.
 *
 * @author Lizeth Pulido Davila
 * @version 1.0
 * @see com.epam.tasks.arrays.sorter
 */

public class SortingApp {
    public static void main(String[] args) {
        /**
         * The sortedArray contains the integer values took from the String arguments.
         */
        int[] sortedArray = Sorter.sortArray(args);
        for (int value : sortedArray) {
            System.out.println(value);
        }
    }
}
