package com.pau;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 * Unit test for Sorting App.
 * These unit tests check for zero arguments or more than 10 arguments, in which case the tests don't pass.
 */

@RunWith(value = Parameterized.class)
public class AppTest {

    /**
     * Constructor which takes as an argument an array which has the inputs for the function,
     * which are in a file named numbers.txt in the resources folder
     */
    int[] array;
    public AppTest(int[] array){
        this.array = array;
    }

    /**
     * This function gets the parameters from the file mentioned before and converts them into an int array.
     * The function returns an arraylist (inputs), in which each element is a line from the file already processed.
     * If the line in the file is empty which means the function would take zero parameters,
     * it adds an empty array into the parameters list.
     * The lines in the file include two cases in which the number of elements is greater than 10 and one in which
     * the number of elements is zero.
     */
    @Parameterized.Parameters
    public static List<int[]> data(){
        List<int[]> inputs = new ArrayList<>();
        try {
            File input = new File("src/test/resources/numbers.txt");
            Scanner in = new Scanner(input);
            while (in.hasNext()) {
                String line = in.nextLine();
                String[] stringArray = line.split(" ");
                if (stringArray[0].equals("")) {
                    inputs.add(new int[0]);
                } else {
                    int[] array = new int[stringArray.length];
                    for (int i = 0; i < stringArray.length; i++) {
                        array[i] = Integer.parseInt(stringArray[i]);
                    }
                    inputs.add(array);
                }
            }
        } catch (FileNotFoundException e){ System.out.println("No such file at location"); }
        return inputs;
    }

    /**
     * This test checks if the given array has more than 10 elements or has zero element, in which case the
     * function should throw an IllegalArgumentException. The test passes if such exception is thrown.
     */
    @Test (expected = IllegalArgumentException.class)
    public void notNullOrMore(){
        App app = new App(array);
        app.verifyMore();
        app.verifyZero();
    }
}
