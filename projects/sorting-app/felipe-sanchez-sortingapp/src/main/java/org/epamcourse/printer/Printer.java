package org.epamcourse.printer;


/**
 *
 * Printer class functions is manage the printing of information passed as argument to its methods
 * @author Andrés Felipe Sánchez Sánchez
 *
 * */
public class Printer {
    /**
     * Prints an array of elements of type object in the standard output
     *
     * @param ar: array of Objects to be printed
     * */
    public static void printObjects(Object []ar){
        StringBuilder sb=new StringBuilder();
        for (int i =0;i<ar.length;i++)
            sb.append(ar[i]).append(" ");

        System.out.println(sb.toString().trim());
    }
}
