package org.Daniel.ArgumentParser;

import java.util.Arrays;


public class ArgumentParser {

    /** Max number of arguments to sort */
    static public final int MAX_ARGUMENTS = 10;

    /** Sorted integer array of the arguments */
    private int[] arguments;

    /**
     * ArgumentParser constructor, sorts the arguments array if it's valid
     * @param args String array of numbers in integer format
     * @throws IllegalArgumentException if the array size is over {@value #MAX_ARGUMENTS}
     * @throws IllegalArgumentException if the format of any value in the array is not an integer
     */
    public ArgumentParser(String[] args) {
        if(args.length>MAX_ARGUMENTS) throw new IllegalArgumentException("Over 10 arguments");

        arguments = new int[args.length];

        // Check if all arguments are valid integers
        try {
            for (int i = 0; i < args.length; i++) {
                arguments[i] = Integer.parseInt(args[i]);
            }
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Arguments must be valid integers");
        }
        Arrays.sort(arguments);
    }

    /**
     *  Prints the sorted arguments array
     */
    public void printSortedArguments(){
        System.out.println(Arrays.toString(arguments));
    }
}
