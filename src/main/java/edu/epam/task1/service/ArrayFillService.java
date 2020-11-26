package edu.epam.task1.service;

import edu.epam.task1.entity.Array;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayFillService {
    private static final Logger logger = LogManager.getLogger(ArrayFillService.class);

    public Array fillRandomNumbers(int size) {
        Array array = new Array(size);
        Random random = new Random();
        for (int i = 0; i < array.size(); i++) {
            array.set(i, random.nextInt());
        }
        logger.log(Level.INFO, "array filled: " + array);
        return array;
    }

    public Array fillFileNumbers(String fileName) {
        Array array = new Array();
        List<Integer> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(new FileReader(fileName))){
            while (scanner.hasNextInt()) {
                list.add(scanner.nextInt());
            }
            array = new Array(list.size());
            for (int i = 0; i < array.size(); i++) {
                array.set(i, list.get(i));
            }
            logger.log(Level.INFO, "array filled: " + array);
        } catch (Exception e) {
            logger.log(Level.ERROR, "wrong file name");
        }
        return array;
    }
}
