package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingApp {

    private ArrayList<Integer> list = new ArrayList<>();

    public void populateList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integer valid numbers (enter 'f' to finish before enter 10 numbers)");
        System.out.println();
        int cont = 1;
        while (scanner.hasNext() && cont <= 10) {
            System.out.println("Enter element[" + cont + "]: ");
            String input = scanner.next();
            try {
                if ("f".equals(input)) {
                    break;
                }
                list.add(Integer.parseInt(input));
                cont++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }
        scanner.close();
    }

    public void sort() {
        Collections.sort(list);
        System.out.println(list);
    }

    public ArrayList<Integer> getList() {
        return list;
    }
}
