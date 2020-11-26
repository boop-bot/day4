package edu.epam.task2.service;

import java.util.Comparator;

public class SmallestNumberComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] array1, int[] array2) {
        return FindService.findSmallestNumber(array1) - FindService.findSmallestNumber(array2);
    }
}
