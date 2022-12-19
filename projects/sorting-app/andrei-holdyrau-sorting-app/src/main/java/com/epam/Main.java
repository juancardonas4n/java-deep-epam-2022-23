package com.epam;

import java.util.Arrays;

/**
 * This class takes up to ten command-line arguments as
 *  integer values, calls {@link Sorting} to sort them in the ascending order,
 *  and then prints them into standard output.
 * @author Andrey Holdyrau
 */

public class Main {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("At least one argument is required");
        }
        else if (args.length > 10){
            System.out.println("Max number of arguments is 10");
        }
        else {
            int size = args.length;
            int[] arr = new int[size];
            try {
                for (int i = 0; i < size; i++) {
                    arr[i] = Integer.parseInt(args[i]);
                }
                Sorting sortArr = new Sorting();
                sortArr.sort(arr);
                System.out.println(Arrays.toString(arr));
            } catch (NumberFormatException nfe) {
                System.out.println("All arguments should be integers");
            }
        }
    }
}
