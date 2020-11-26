package edu.epam.task2.service;

import edu.epam.task2.entity.JaggedArray;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Comparator;

import static org.testng.Assert.*;

public class SortServiceTest {
    SortService sortService;
    JaggedArray jaggedArray;

    @BeforeMethod
    public void setUp() {
        sortService = new SortService();
        jaggedArray = new JaggedArray(new int[][]{{1, 222, 11}, {3, 111}, {2, 33, 444, 5555}});
    }

    @Test
    public void testSortRowSumAscending() {
        Comparator<int[]> comparator = new SumNumberComparator();
        int[][] expected = new int[][]{{3, 111}, {1, 222, 11}, {2, 33, 444, 5555}};
        int[][] actual = jaggedArray.getValue();
        sortService.sort(actual, comparator);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortRowSumDescending() {
        Comparator<int[]> comparator = new SumNumberComparator();
        int[][] expected = new int[][]{{2, 33, 444, 5555}, {1, 222, 11}, {3, 111}};
        int[][] actual = jaggedArray.getValue();
        sortService.sort(actual, comparator);
        sortService.reverse(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortLargestNumberAscending() {
        Comparator<int[]> comparator = new LargestNumberComparator();
        int[][] expected = new int[][]{{3, 111}, {1, 222, 11}, {2, 33, 444, 5555}};
        int[][] actual = jaggedArray.getValue();
        sortService.sort(actual, comparator);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortLargestNumberDescending() {
        Comparator<int[]> comparator = new LargestNumberComparator();
        int[][] expected = new int[][]{{2, 33, 444, 5555}, {1, 222, 11}, {3, 111}};
        int[][] actual = jaggedArray.getValue();
        sortService.sort(actual, comparator);
        sortService.reverse(actual);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortSmallestNumberAscending() {
        Comparator<int[]> comparator = new SmallestNumberComparator();
        int[][] expected = new int[][]{{1, 222, 11}, {2, 33, 444, 5555}, {3, 111}};
        int[][] actual = jaggedArray.getValue();
        sortService.sort(actual, comparator);
        assertEquals(actual, expected);
    }

    @Test
    public void testSortSmallestNumberDescending() {
        Comparator<int[]> comparator = new SmallestNumberComparator();
        int[][] expected = new int[][]{{3, 111}, {2, 33, 444, 5555}, {1, 222, 11}};
        int[][] actual = jaggedArray.getValue();
        sortService.sort(actual, comparator);
        sortService.reverse(actual);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        sortService = null;
        jaggedArray = null;
    }
}