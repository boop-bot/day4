package edu.epam.task2.service;

import java.util.Comparator;

public class SortService {
    public void sort(int[][] jaggedArray, Comparator<int[]> comparator, boolean flag) {
        int coefficient = flag ? 1 : -1;
        for (int i = 0; i < jaggedArray.length - 1; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {
                if (coefficient * comparator.compare(jaggedArray[j], jaggedArray[j + 1]) < 0) {
                    swap(jaggedArray, j, j + 1);
                }
            }
        }
    }

    public void swap(int[][] array, int row1, int row2) {
        int[] tempArray;
        tempArray = array[row2];
        array[row2] = array[row1];
        array[row1] = tempArray;
    }
}
