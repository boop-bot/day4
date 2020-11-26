package edu.epam.task1.service;

import edu.epam.task1.entity.Array;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortService {
    private static final Logger logger = LogManager.getLogger(ArraySortService.class);

    public void bubbleSort(Array array) {
        int temp = 0;
        for (int i = 0; i < array.size() - 1; i++) {
            for (int j = 0; j < array.size() - i - 1; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }
        logger.log(Level.INFO, "bubble sort completed: " + array);
    }

    public void insertionSort(Array array) {
        int key = 0;
        int j = 0;
        for (int i = 1; i < array.size(); i++) {
            key = array.get(i);
            j = i - 1;
            while (j >= 0 && array.get(j) > key) {
                array.set(j + 1, array.get(j));
                j -= 1;
            }
            array.set(j + 1, key);
        }
        logger.log(Level.INFO, "insertion sort completed: " + array);
    }

    public void selectionSort(Array array) {
        int temp = 0;
        int minIndex = 0;
        for (int i = 0; i < array.size(); i++) {
            minIndex = i;
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
                }
            }
            temp = array.get(minIndex);
            array.set(minIndex, array.get(i));
            array.set(i, temp);
        }
        logger.log(Level.INFO, "selection sort completed: " + array);
    }
}
