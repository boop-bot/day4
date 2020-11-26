package edu.epam.task2.service;

public class FindService {
    public static int findLargestNumber(int[] array) {
        int largestNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }
        return largestNumber;
    }

    public static int findSmallestNumber(int[] array) {
        int smallestNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }

    public static int findRowSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
