package edu.epam.task1.service;

import edu.epam.task1.entity.Array;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySortServiceTest {
    private ArraySortService arraySortService;

    @BeforeMethod
    public void setUp() {
        arraySortService = new ArraySortService();
    }

    @Test
    public void testBubbleSort() {
        Array expected = new Array(1,2,3,4,5);
        Array actual = new Array(5,4,2,1,3);
        arraySortService.bubbleSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testInsertionSort() {
        Array expected = new Array(7,8,9,10,11);
        Array actual = new Array(10,11,9,7,8);
        arraySortService.insertionSort(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        Array expected = new Array(1,22,33,44,55);
        Array actual = new Array(1,55,44,22,33);
        arraySortService.selectionSort(actual);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        arraySortService = null;
    }
}