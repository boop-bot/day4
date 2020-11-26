package edu.epam.task2.service;

import java.util.Comparator;

public class LargestNumberComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] array1, int[] array2) {
        return FindService.findLargestNumber(array1) - FindService.findLargestNumber(array2);
    }
}
