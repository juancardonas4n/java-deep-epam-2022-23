package com.epam.rd.autotasks;

import java.util.Arrays;

import static java.lang.Math.min;

/**
 * Sorting App Project
 * <p>
 * Complete the task to get a practical grasp of Apache Maven and its major features.
 * You will need to create a Maven-based project – Sorting App.
 * It is a small Java application that takes up to ten command-line arguments as integer values,
 * sorts them in the ascending order, and then prints them into standard output.
 * 
 *	@author: Julian Gaitan
 */
public class SimpleSort {
    public static void main(String[] args) {
        int[] numbers = new int[min(args.length, 10)];
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("Illegal input: " + args[i], ex);
            }
        }
        Arrays.sort(numbers);
        String output = Arrays.toString(numbers);
        output = output.substring(1, output.length()-1).replace(", ", " ");
        System.out.println(output);
    }
}
