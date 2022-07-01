package com.exercises.list;

import java.util.Arrays;
import java.util.SortedMap;

public class Array {
    public static void main(String[] args) {

        int table[] = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = 101 + i;

            System.out.println("Wartość table = " + table[i]);

        }
        System.out.println();
        int tableFirst[] = new int[10];
        for (int i = 0; i < 10; i++) {
            tableFirst[i] = (i + 1) * 10;
            System.out.println("Wartość table_First = " + tableFirst[i]);
        } System.out.println();
        boolean tableSecond[] = new boolean[20];

            for (int i = 0; i < 20; i += 2){
                tableSecond[i] = true;
    }

            for (int i = 0; i < 20; i ++){

            System.out.println("Watrości table_second = " +  i + "\t" + tableSecond[i]);
        }







    }
}

















