package edu.epam.task1.service;

import edu.epam.task1.entity.NumberArray;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

public class NumberArrayFindServiceTest {
    private NumberArrayFindService arrayFindService;
    private NumberArray numberArray;

    @BeforeMethod
    public void setUp() {
        arrayFindService = new NumberArrayFindService();
        numberArray = new NumberArray(1, 2, 3, 5, 21, 101, 203, 709, 9999);
    }

    @Test
    public void testBinarySearch() {
        int expected = 4;
        int actual = arrayFindService.binarySearch(numberArray, 21);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMinNumber() {
        int expected = 1;
        int actual = arrayFindService.findMinElement(numberArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindMaxNumber() {
        int expected = 9999;
        int actual = arrayFindService.findMaxElement(numberArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindPrimeNumber() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 101, 709);
        List<Integer> actual = arrayFindService.findPrimeNumbers(numberArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindFibonacciNumber() {
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 21);
        List<Integer> actual = arrayFindService.findFibonacciNumbers(numberArray);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindDifferentNumber() {
        List<Integer> expected = Arrays.asList(203, 709);
        List<Integer> actual = arrayFindService.findDifferentNumbers(numberArray);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        arrayFindService = null;
        numberArray = null;
    }
}