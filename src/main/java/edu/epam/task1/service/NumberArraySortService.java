package edu.epam.task1.service;

import edu.epam.task1.entity.NumberArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NumberArraySortService {
    private static final Logger logger = LogManager.getLogger(NumberArraySortService.class);

    public void bubbleSort(NumberArray numberArray) {
        int temp = 0;
        for (int i = 0; i < numberArray.size() - 1; i++) {
            for (int j = 0; j < numberArray.size() - i - 1; j++) {
                if (numberArray.get(j) > numberArray.get(j + 1)) {
                    temp = numberArray.get(j);
                    numberArray.set(j, numberArray.get(j + 1));
                    numberArray.set(j + 1, temp);
                }
            }
        }
        logger.log(Level.INFO, "bubble sort completed: " + numberArray);
    }

    public void insertionSort(NumberArray numberArray) {
        int key = 0;
        int j = 0;
        for (int i = 1; i < numberArray.size(); i++) {
            key = numberArray.get(i);
            j = i - 1;
            while (j >= 0 && numberArray.get(j) > key) {
                numberArray.set(j + 1, numberArray.get(j));
                j -= 1;
            }
            numberArray.set(j + 1, key);
        }
        logger.log(Level.INFO, "insertion sort completed: " + numberArray);
    }

    public void selectionSort(NumberArray numberArray) {
        int temp = 0;
        int minIndex = 0;
        for (int i = 0; i < numberArray.size(); i++) {
            minIndex = i;
            for (int j = i + 1; j < numberArray.size(); j++) {
                if (numberArray.get(j) < numberArray.get(minIndex)) {
                    minIndex = j;
                }
            }
            temp = numberArray.get(minIndex);
            numberArray.set(minIndex, numberArray.get(i));
            numberArray.set(i, temp);
        }
        logger.log(Level.INFO, "selection sort completed: " + numberArray);
    }
}
