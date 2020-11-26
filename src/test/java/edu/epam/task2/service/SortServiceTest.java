package edu.epam.task2.service;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;

import static org.testng.Assert.*;

public class SortServiceTest {
    SortService sortService;
    int[][] array;

    @BeforeMethod
    public void setUp() {
        sortService = new SortService();
        array = new int[][]{{1, 222, 11}, {3, 111}, {2, 33, 444, 5555}};
    }

    @Test
    public void testSortRowSumAscending() {
        Comparator<int[]> comparator = new SumNumberComparator();
        boolean reverseOrder = false;
        int[][] expected = new int[][]{{3, 111}, {1, 222, 11}, {2, 33, 444, 5555}};
        int[][] actual = new int[][]{{1, 222, 11}, {3, 111}, {2, 33, 444, 5555}};
        sortService.sort(actual, comparator, reverseOrder);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortRowSumDescending() {
        Comparator<int[]> comparator = new SumNumberComparator();
        boolean reverseOrder = true;
        int[][] expected = new int[][]{{2, 33, 444, 5555}, {1, 222, 11}, {3, 111}};
        int[][] actual = new int[][]{{1, 222, 11}, {3, 111}, {2, 33, 444, 5555}};
        sortService.sort(actual, comparator, reverseOrder);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortLargestNumberAscending() {
        Comparator<int[]> comparator = new LargestNumberComparator();
        boolean reverseOrder = false;
        int[][] expected = new int[][]{{3, 111}, {1, 222, 11}, {2, 33, 444, 5555}};
        int[][] actual = new int[][]{{1, 222, 11}, {3, 111}, {2, 33, 444, 5555}};
        sortService.sort(actual, comparator, reverseOrder);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortLargestNumberDescending() {
        Comparator<int[]> comparator = new LargestNumberComparator();
        boolean reverseOrder = true;
        int[][] expected = new int[][]{{2, 33, 444, 5555}, {1, 222, 11}, {3, 111}};
        int[][] actual = new int[][]{{1, 222, 11}, {3, 111}, {2, 33, 444, 5555}};
        sortService.sort(actual, comparator, reverseOrder);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortSmallestNumberAscending() {
        Comparator<int[]> comparator = new SmallestNumberComparator();
        boolean reverseOrder = false;
        int[][] expected = new int[][]{{1, 222, 11}, {2, 33, 444, 5555}, {3, 111}};
        int[][] actual = new int[][]{{1, 222, 11}, {3, 111}, {2, 33, 444, 5555}};
        sortService.sort(actual, comparator, reverseOrder);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortSmallestNumberDescending() {
        Comparator<int[]> comparator = new SmallestNumberComparator();
        boolean reverseOrder = true;
        int[][] expected = new int[][]{{3, 111}, {2, 33, 444, 5555}, {1, 222, 11}};
        int[][] actual = new int[][]{{1, 222, 11}, {3, 111}, {2, 33, 444, 5555}};
        sortService.sort(actual, comparator, reverseOrder);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        sortService = null;
        array = null;
    }
}