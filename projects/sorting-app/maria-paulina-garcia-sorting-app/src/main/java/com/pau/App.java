package com.pau;

import java.util.Arrays;

/**
 * This app takes up to ten command-line arguments as integer values,
 * sorts them in the ascending order, and then prints them into standard output.
 *
 * @author Maria Paulina Garcia Velasquez.
 */
public class App 
{
    /**
     * The constructor takes the argument "args" which is the array of int elements to be sorted.
     */
    int[] args;
    public App (int[] args){
        this.args = args;
    }

    /**
     *This function verifies if the number of elements is zero,
     * in which case throws an IllegalArgumentException.
     */
    public void verifyZero (){
        if (this.args.length == 0){
            throw new IllegalArgumentException("The array length must be greater than 0");
        }
    }

    /**
     *  This function verifies if the number of elements is greater than 10,
     *  in which case throws an IllegalArgumentException.
     */
    public void verifyMore (){
        if (this.args.length > 10) {
            throw new IllegalArgumentException("The array length must be equal or less than 10");
        }
    }

    /**
     * This function sorts the array in ascending order using Arrays.sort and returns the ordered array.
     */
    public void sortArgs(){
        Arrays.sort(this.args);
        System.out.println(Arrays.toString(this.args));
    }

    public static void main(String[] args){
        System.out.println("This app sorts an array!");
        App app = new App(new int[]{5, 3, 2, 1, 8, 9, 10});
        app.sortArgs();
    }
}
