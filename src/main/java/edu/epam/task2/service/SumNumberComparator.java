package edu.epam.task2.service;

import java.util.Comparator;

public class SumNumberComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] array1, int[] array2) {
        return FindService.findRowSum(array1) - FindService.findRowSum(array2);
    }
}
