package edu.epam.task1.service;

import edu.epam.task1.entity.NumberArray;
import edu.epam.task1.util.ArrayCreator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberArrayCreatorTest {
    private final String fileName = "data/input.txt";
    private ArrayCreator arrayCreator;

    @BeforeMethod
    public void setUp() {
        arrayCreator = new ArrayCreator();
    }

    @Test
    public void testFillFileNumbers() {
        NumberArray expected = new NumberArray(8, 9, 5, 80, 78, 34, 6, 64, 15, 30);
        NumberArray actual = arrayCreator.fillFileNumbers(fileName);
        assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        arrayCreator = null;
    }
}