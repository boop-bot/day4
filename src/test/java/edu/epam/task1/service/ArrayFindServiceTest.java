package edu.epam.task1.service;

import edu.epam.task1.entity.Array;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class ArrayFindServiceTest {
    private ArrayFindService arrayFindService;
    private Array array;

    @BeforeMethod
    public void setUp() {
        arrayFindService = new ArrayFindService();
        array = new Array(1, 2, 3, 5, 21, 101, 203, 709, 9999);
    }

    @Test
    public void testBinarySearch() {
        int expected = 4;
        int actual = arrayFindService.binarySearch(array, 21);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMinNumber() {
        int expected = 1;
        int actual = arrayFindService.findMinElement(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMaxNumber() {
        int expected = 9999;
        int actual = arrayFindService.findMaxElement(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindPrimeNumber() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 101, 709);
        List<Integer> actual = arrayFindService.findPrimeNumbers(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindFibonacciNumber() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 21);
        List<Integer> actual = arrayFindService.findFibonacciNumbers(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindDifferentNumber() {
        List<Integer> expected = Arrays.asList(203, 709);
        List<Integer> actual = arrayFindService.findDifferentNumbers(array);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        arrayFindService = null;
        array = null;
    }
}