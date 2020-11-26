package edu.epam.task1.service;

import edu.epam.task1.entity.NumberArray;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberNumberArraySortServiceTest {
    private NumberArraySortService numberArraySortService;

    @BeforeMethod
    public void setUp() {
        numberArraySortService = new NumberArraySortService();
    }

    @Test
    public void testBubbleSort() {
        NumberArray expected = new NumberArray(1,2,3,4,5);
        NumberArray actual = new NumberArray(5,4,2,1,3);
        numberArraySortService.bubbleSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        NumberArray expected = new NumberArray(7,8,9,10,11);
        NumberArray actual = new NumberArray(10,11,9,7,8);
        numberArraySortService.insertionSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        NumberArray expected = new NumberArray(1,22,33,44,55);
        NumberArray actual = new NumberArray(1,55,44,22,33);
        numberArraySortService.selectionSort(actual);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        numberArraySortService = null;
    }
}