package com.epam.rd.appsorting;

import java.util.Arrays;

/**
 * This class is for takes up to ten command-line arguments as integer values,
 * sorts them in the ascending order, and then prints them into standard output.
 *
 * @author daniel anaya murcia
 * @version 1.0.0
 */

public class Sorting {

    /**
     *This is the main method where we call sort and print a sorted int array.
     *
     * @param args values of the array, have to be 10 or less and integer values.
     */
    public static void main(String[] args) {
       int[]arr=sort(args);
        System.out.println(Arrays.toString(arr));

    }

    /**
     *In this method we ensure that the arguments are integers and not null,empty or char...
     * (if that is not the case the code throw an Exception);Then we parse the arguments and
     * put them into an array to do the sorting.
     *
     * @param args ""
     * @return sorted array of integers
     */
    public static int[] sort(String[]args){
        if (args == null || args.length == 0 || args.length>10 ){
            throw new IllegalArgumentException();
        }
        int[] arr=new int[args.length];
        try {
            for (int i =0; i< arr.length;i++){
                arr[i]=Integer.parseInt(args[i]);
            }

        } catch( Exception e ) {
            throw new NumberFormatException("must be an integer");
        }

        Arrays.sort(arr);


        return arr;


    }

}

