package edu.epam.task1.service;

import edu.epam.task1.entity.Array;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

public class ArrayFindService {
    private static final Logger logger = LogManager.getLogger(ArrayFindService.class);

    public int binarySearch(Array array, int ... values) {
        if (values.length == 1) {
            return binarySearch(array, 0, array.size() - 1, values[0]);
        } else {
            if (values[1] >= values[0]) {
                int mid = values[0] + (values[1] - values[0]) / 2;

                if (array.get(mid) == values[2]) {
                    return mid;
                }

                if (array.get(mid) > values[2]) {
                    return binarySearch(array, values[0], mid - 1, values[2]);
                }

                return binarySearch(array, mid + 1, values[1], values[2]);
            }
        }
        return -1;
    }

    public int findMinElement(Array array) {
        int res = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            res = (res < array.get(i)) ? res : array.get(i);
        }
        logger.log(Level.INFO, "min element found: " + res);
        return res;
    }

    public int findMaxElement(Array array) {
        int res = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            res = (res > array.get(i)) ? res : array.get(i);
        }
        logger.log(Level.INFO, "max element found: " + res);
        return res;
    }

    public List<Integer> findPrimeNumbers(Array array) {
        List<Integer> res = new LinkedList<>();

        for (int i = 0; i < array.size(); i++) {
            if (isPrime(array.get(i))) {
                res.add(array.get(i));
            }
        }
        logger.log(Level.INFO, "prime numbers found: " + res.toString());
        return res;
    }

    public List<Integer> findFibonacciNumbers(Array array) {
        List<Integer> res = new LinkedList<>();

        for (int i = 0; i < array.size(); i++) {
            if (isFib(array.get(i))) {
                res.add(array.get(i));
            }
        }
        logger.log(Level.INFO, "fibonacci numbers found: " + res.toString());
        return res;
    }

    public List<Integer> findDifferentNumbers(Array array) {
        List<Integer> res = new LinkedList<>();

        for (int i = 0; i < array.size(); i++) {
            if (countDigit(array.get(i)) == 3 && hasDifferentDigits(array.get(i))) {
                res.add(array.get(i));
            }
        }
        logger.log(Level.INFO, "3 digit numbers found: " + res.toString());
        return res;
    }

    private boolean isPrime(int n) {
        if (n == 1 || n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isFib(int n) {
        int a = 0;
        int b = 1;
        if (n == a || n == b) {
            return true;
        }
        int c = a + b;
        while (c <= n) {
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }

    private int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    private boolean hasDifferentDigits(int n) {
        int number1 = n % 10;
        int number2 = n / 100;
        int number3 = (n % 100) / 10;
        return (number1 != number2) && (number1 != number3) && (number2 != number3);
    }
}
