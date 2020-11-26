package edu.epam.task2.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindServiceTest {

    @Test
    public void testFindLargestNumber() {
        int[] array = {14,201,32,47};
        int expected = 201;
        int actual = FindService.findLargestNumber(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindSmallestNumber() {
        int[] array = {14,201,32,47};
        int expected = 14;
        int actual = FindService.findSmallestNumber(array);
        assertEquals(actual, expected);
    }

    @Test
    public void testFindRowSum() {
        int[] array = {1,10,100,1000};
        int expected = 1111;
        int actual = FindService.findRowSum(array);
        assertEquals(actual, expected);
    }

}