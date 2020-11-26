package edu.epam.task1.service;

import edu.epam.task1.entity.Array;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayFillServiceTest {
    private final String fileName = "src/main/java/edu/epam/task1/data/input.txt";
    private ArrayFillService arrayFillService;

    @BeforeMethod
    public void setUp() {
        arrayFillService = new ArrayFillService();
    }

    @Test
    public void testFillFileNumbers() {
        Array expected = new Array(8, 9, 5, 80, 78, 34, 6, 64, 15, 30);
        Array actual = arrayFillService.fillFileNumbers(fileName);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        arrayFillService = null;
    }
}