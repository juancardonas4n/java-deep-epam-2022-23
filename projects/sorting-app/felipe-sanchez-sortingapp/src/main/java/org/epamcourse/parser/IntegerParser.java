package org.epamcourse.parser;
import static java.lang.Math.*;
/**
 *
 *  IntegerParser class allows parse different type of objects to Integer if it is possible.
 *
 * @author Andrés Felipe Sánchez Sánchez
 *
 *
 *
 * */
public class IntegerParser {
    /**
     * Parse an array of Strings to an array of Integers. This method only parse up to ten elements, if one of the
     * ten first elements cannot be casted to Integer then the method throws an IllegalArgumentException. The 11st and other elements
     * are ignored
     *
     * @param args: array of String objects to be parsed to Integers
     * @throws IllegalArgumentException in case that one of the first 10 elements cannot be casted to Integer
     * @return The array of Integers
     * */
    public static  Integer[] parseStrings(String[] args) throws IllegalArgumentException{

        Integer []result=new Integer[min(args.length,10)];

        int toInsert=0;
        for(String arg:args){

            if(toInsert>=10)
                break;

            try{
                result[toInsert]=Integer.valueOf(arg);
                toInsert++;
            }catch (NumberFormatException e ){
                System.err.println("not allowed not integers arguments");
                throw new IllegalArgumentException();
                //System.exit(-1);
            }



        }

        return result;


    }



}
