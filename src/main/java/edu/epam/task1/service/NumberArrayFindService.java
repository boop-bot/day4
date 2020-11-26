package edu.epam.task1.service;

import edu.epam.task1.entity.NumberArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumberArrayFindService {
    private static final Logger logger = LogManager.getLogger(NumberArrayFindService.class);

    public int binarySearch(NumberArray numberArray, int key) {
        int index = -1;
        int low = 0;
        int high = numberArray.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numberArray.get(mid) < key) {
                low = mid + 1;
            } else if (numberArray.get(mid) > key) {
                high = mid - 1;
            } else if (numberArray.get(mid) == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public int findMinElement(NumberArray numberArray) {
        int res = numberArray.get(0);

        for (int i = 1; i < numberArray.size(); i++) {
            res = (res < numberArray.get(i)) ? res : numberArray.get(i);
        }
        logger.log(Level.INFO, "min element found: " + res);
        return res;
    }

    public int findMaxElement(NumberArray numberArray) {
        int res = numberArray.get(0);

        for (int i = 1; i < numberArray.size(); i++) {
            res = (res > numberArray.get(i)) ? res : numberArray.get(i);
        }
        logger.log(Level.INFO, "max element found: " + res);
        return res;
    }

    public List<Integer> findPrimeNumbers(NumberArray numberArray) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < numberArray.size(); i++) {
            if (isPrime(numberArray.get(i))) {
                res.add(numberArray.get(i));
            }
        }
        logger.log(Level.INFO, "prime numbers found: " + res.toString());
        return res;
    }

    public List<Integer> findFibonacciNumbers(NumberArray numberArray) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < numberArray.size(); i++) {
            if (isFib(numberArray.get(i))) {
                res.add(numberArray.get(i));
            }
        }
        logger.log(Level.INFO, "fibonacci numbers found: " + res.toString());
        return res;
    }

    public List<Integer> findDifferentNumbers(NumberArray numberArray) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < numberArray.size(); i++) {
            if (countDigit(numberArray.get(i)) == 3 && hasDifferentDigits(numberArray.get(i))) {
                res.add(numberArray.get(i));
            }
        }
        logger.log(Level.INFO, "3 digit numbers found: " + res.toString());
        return res;
    }

    private boolean isPrime(int n) {
        boolean result = true;

        for (int i = 2; i <= Math.sqrt(n); i += 1) {
            if (n % i == 0) {
                result = false;
            }
        }
        return result;
    }

    private boolean isFib(int n) {
        int a = 0;
        int b = 1;
        boolean result = false;
        if (n == a || n == b) {
            result = true;
        }
        int c = a + b;
        while (c <= n) {
            if (c == n) {
                result = true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return result;
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
        String number = Integer.toString(n);
        return (number.charAt(0) != number.charAt(1))
                && (number.charAt(0) != number.charAt(2))
                && (number.charAt(1) != number.charAt(2));
    }
}
