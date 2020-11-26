package edu.epam.task2.service;

import edu.epam.task1.service.NumberArraySortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Comparator;

public class SortService {
    private static final Logger logger = LogManager.getLogger(SortService.class);

    public void sort(int[][] jaggedArray, Comparator<int[]> comparator) {
        for (int i = 0; i < jaggedArray.length - 1; i++) {
            for (int j = 0; j < jaggedArray.length - 1; j++) {
                if (comparator.compare(jaggedArray[j], jaggedArray[j + 1]) > 0) {
                    swap(jaggedArray, j, j + 1);
                }
            }
        }
        logger.log(Level.INFO, "sort completed: " + Arrays.deepToString(jaggedArray));
    }

    public void reverse(int[][] jaggedArray) {
        for (int i = 0; i < jaggedArray.length / 2; i++) {
            swap(jaggedArray, i, jaggedArray.length - i - 1);
        }
    }

    public void swap(int[][] array, int row1, int row2) {
        int[] tempArray;
        tempArray = array[row2];
        array[row2] = array[row1];
        array[row1] = tempArray;
    }
}
