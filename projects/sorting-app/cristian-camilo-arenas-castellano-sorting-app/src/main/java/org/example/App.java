package org.example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * App
 *
 */
public class App 
{

    /**
     *
     * @param args command line array of arguments treated as String
     */
    public static void main( String[] args )
    {

        // The user enter the command line arguments

        if(args.length == 0){ // Provides the verification when no data are provided
            throw new IllegalArgumentException();
        } else if (args.length > 10) { // Provides the verification for the limit of data provided
            throw new IllegalArgumentException();
        }else{

            /**
             * Provide the implementation to return an array of sort numbers
             */

            App app = new App();
            String[] ans = app.sortArr(args);
            for (int i = 0; i < ans.length; i++){
                System.out.println(ans[i]);
            }


        }

    }


    /**
     *
     * @param arr is an array with the numbers in String type to be sorted
     * @return an array that contains the sorted numbers in String type
     */
    public String[] sortArr(String[] arr){
        int[] numbers = new int[arr.length];
        String[] ans = new String[arr.length];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numbers);
        for (int j = 0; j < ans.length; j++){
            ans[j] = String.valueOf(numbers[j]);
        }
        return ans;
    }
}
