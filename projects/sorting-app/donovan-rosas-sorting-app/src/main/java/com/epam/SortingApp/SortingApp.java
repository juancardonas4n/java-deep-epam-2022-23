package com.epam.SortingApp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A class for a Sorting App.
 * @author Donovan Rosas
 */
public class SortingApp {
    /**
     * Maximum number of possible values to be sorted.
     */
    final static int MAX_NUMBERS_VALUE = 10;
    /**
     * Regex for only accept numbers.
     */
    final static String ONLY_NUMBERS = "^-?[0-9]*";
    /**
     * Sort 10 integer arguments and print it in the console
     *
     * @param  arguments Is an array of strings .
     * @throws IllegalArgumentException
     *    if the arguments is null, not a number or  not in the range 1
     *    to 10.
     */
    public void sortingApp(String[] arguments){
        if(arguments != null){
            if(arguments.length <= MAX_NUMBERS_VALUE){
                int [] values = new int[arguments.length];
                Pattern regex = Pattern.compile(ONLY_NUMBERS);
                for(int i = 0; i<arguments.length; i++){
                    Matcher m = regex.matcher(arguments[i]);
                    if(m.matches()){
                        values[i]= Integer.parseInt(arguments[i]);
                    }else {
                        throw new IllegalArgumentException();
                    }

                }
                Arrays.sort(values);
                System.out.println(Arrays.toString(values));
            }else{
                throw new IllegalArgumentException();
            }
        }else{
            throw new IllegalArgumentException();
        }
    }
}
