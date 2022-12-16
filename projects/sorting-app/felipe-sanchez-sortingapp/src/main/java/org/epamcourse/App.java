package org.epamcourse;

import org.epamcourse.parser.IntegerParser;
import org.epamcourse.printer.Printer;

import org.epamcourse.sorter.Sorter;



/**
 * App class for solve App Sorting Exercise
 *
 * @author Andrés Felipe Sánchez Sánchez
 */
public class App {

    /**
     * Main Function of the program who read a set of integers, sort them and print it in the console
     *
     * @param args: arguments
     */
    public static void main(String[] args) {

        try {
            Integer[] integers = IntegerParser.parseStrings(args);
            Sorter.sort(integers);
            Printer.printObjects(integers);
        }catch (IllegalArgumentException e){

        }

    }





}
