package com.Pablo.consoleSort;

import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.ArrayUtils;

/**
 * Main class of program
 * Sorts in ascending order a given set of numbers (int) provided by the user through console arguments.
 * and prints them to standar output
 * <ul>
 *     <li>only integers without decimal point are allowed</li>
 *     <li>accepts negative numbers</li>
 *     <li>accepts repetition of numbers</li>
 *     <li>accepts 1 to 10 (console) arguments</li>
 * </ul>
 */
public class App
{
    /**
     * Creates an int[] array with the elements from "args", sorts them in ascending order and prints them
     * to <em>standar output</em> with format: {1,2,3,4, etc...}
     * @param args array that contains the numbers that are going to be ordered
     */
    public static void main(String[] args) {

        if( hasValidArguments(args) ) {
            int[] intArray = makeintArray(args);
            ArraySorter.sort(intArray);

            System.out.println("Sorted numbers: "+ ArrayUtils.toString(intArray));

        } else {
            System.exit(-1);
        }

    }

    /**
     * validates that every element in "arguments" can be converted to an int value
     * <ul>
     *     <li>prints a help message if arguments are not valid.</li>
     * </ul>
     * @param arguments group of arguments to be tested
     * @return <ul>
     *     <li><strong><em>true</em></strong> if every element can be converted to an int value</li>
     *     <li><strong><em>false</em></strong> if "arguments" is null, empty (0 elements), or it has more than 10 elements</li>
     * </ul>
     *
     */
    public static boolean hasValidArguments(String[] arguments){
        if( ArrayUtils.isEmpty(arguments) || ArrayUtils.getLength(arguments) > 10){
            System.out.println("there should be at least 1 console argument and up to 10");
            //throw new IllegalArgumentException();
            return false;
        }

        for(String arg: arguments){
            if(! arg.matches("-?\\d+")){
                System.out.println("only integers (no decimal point) are allowed as arguments");
                //throw new IllegalArgumentException();
                return false;
            }
        }

        return true;
    }

    private static int[] makeintArray(String[] arrayOfStrings){
        int arrayLength = ArrayUtils.getLength(arrayOfStrings);
        int[] arrayOfInts = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++){
            arrayOfInts[i] = Integer.parseInt(arrayOfStrings[i]);
        }
        return arrayOfInts;
    }
}
