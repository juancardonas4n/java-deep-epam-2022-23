package com.rpatino12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * Sorting App!
 *
 * */
public class App 
{
    /**
     * Description: Function that sort an array of numbers and return a String representation of sorted numbers
     *
     * @param array Integer array of numbers
     * @return String representation of the sorted numbers
     */
    public String sortNumbers(Integer[] array){
        if (array.length > 10){
            throw new IllegalArgumentException();
        }
        Arrays.sort(array);
        String sortedNumbers = Arrays.toString(array);
        return sortedNumbers.replaceAll("[^\\d||\\s||-]", "");
    }

    /**
     * Description: Function that takes up to ten command-line arguments as integer values
     *
     * @return Array of Integer numbers
     */
    public Integer[] inputNumbers(){
        Scanner scanner = new Scanner(System.in);
        Scanner lineScanner = new Scanner(scanner.nextLine());

        List<Integer> numbers = new ArrayList<>();

        int count = 0;
        while (lineScanner.hasNextInt()) {
            numbers.add(lineScanner.nextInt());
            count++;
            if (count > 10){
                throw new IllegalStateException("The application takes a maximum of ten command-line integer numbers");
            }
        }

        lineScanner.close();
        scanner.close();

        return numbers.toArray(new Integer[0]);
    }

    public static void main(String[] args)
    {
        App sorting = new App();
        Integer[] numbers = sorting.inputNumbers();
        System.out.println(sorting.sortNumbers(numbers));
    }
}
