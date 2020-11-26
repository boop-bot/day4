package edu.epam.task1.util;

import edu.epam.task1.entity.NumberArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class ArrayCreator {
    private static final Logger logger = LogManager.getLogger(ArrayCreator.class);

    public NumberArray fillRandomNumbers(int size) {
        NumberArray numberArray = new NumberArray(size);
        Random random = new Random();
        for (int i = 0; i < numberArray.size(); i++) {
            numberArray.set(i, random.nextInt(1000));
        }
        logger.log(Level.INFO, "array filled with random numbers: " + numberArray);
        return numberArray;
    }

    public NumberArray fillFileNumbers(String fileName) {
        NumberArray numberArray = new NumberArray();
        try (Scanner scanner = new Scanner(new FileReader(fileName))){
            String fileString = scanner.nextLine();
            String numbers[] = fileString.split(" ");
            numberArray = new NumberArray(numbers.length);
            for (int i = 0; i < numberArray.size(); i++) {
                numberArray.set(i, Integer.parseInt(numbers[i]));
            }
            logger.log(Level.INFO, "array filled from file: " + numberArray);
        } catch (FileNotFoundException e) {
            logger.log(Level.ERROR, "error:" + e);
        }
        return numberArray;
    }
}
