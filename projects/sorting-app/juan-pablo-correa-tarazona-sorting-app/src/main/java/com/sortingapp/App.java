package com.sortingapp;

/**
 * Sorting App main class com.sortingapp
 *
 */
public class App {
    
    /** 
     * Sorting main method
     * @param args
     * @throws IllegalArgumentException
     */
    public static void main(String[] args) throws IllegalArgumentException{

        String[] in = args[0].split(" ");

        if (in.length == 0||in.length == 1) {
            return;
        }
        if(in.length > 10){
            throw new IllegalArgumentException();
        }
        int[] array = new int[in.length];

        for (int i = 0; i < in.length; i++) {
            try {
                array[i] = Integer.parseInt(in[i]);
            } catch (Exception e) {
                throw new IllegalArgumentException();
            }
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                int temp = 0;
                if (array[j] < array[i]) {

                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.print(array);
        String out = String.valueOf(array[0]);
        for (int i = 1; i < in.length; i++) {
            out += " " + array[i];
        }
        args[0] = out;
    }

}
