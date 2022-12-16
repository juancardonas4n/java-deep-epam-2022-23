package org.example;

public class App
{

    public static void sort(int[] array){
        if (array == null) throw new IllegalArgumentException();

        // Abort for empty or one element array
        if (array.length < 2) return;

        boolean wasModified;
        int tmp;
        do {
            wasModified = false;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i+1] < array[i]){
                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    wasModified = true;
                }
            }
        } while (wasModified);
    }

    public static void main( String[] args )
    {
        if (args.length == 0 || args.length > 10 ) {
            System.out.println("Invalid argument quantity, MIN=1 MAX=10");
            return;
        }

        int[] numbers = new int[args.length];
        int pos = 0;
        for (String s: args) {
            numbers[pos++] = Integer.parseInt(s);
        }
        sort(numbers);
//        System.out.println(Arrays.toString(numbers));
        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}
