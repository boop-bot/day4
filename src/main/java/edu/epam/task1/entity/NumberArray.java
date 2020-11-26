package edu.epam.task1.entity;

import java.util.Arrays;

public class NumberArray {
    private int[] value;

    public NumberArray() {}

    public NumberArray(int size) {
        this.value = new int[size];
    }

    public NumberArray(int ... value) {
        this.value = value;
    }

    public int get(int i) {
        if (i < 0 || i >= value.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return value[i];
        }
    }

    public void set(int i, int element) {
        if (i < 0 || i >= value.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            value[i] = element;
        }
    }

    public int size() {
        return value.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberArray numberArray = (NumberArray) o;

        return Arrays.equals(value, numberArray.value);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Array: ");
        sb.append(Arrays.toString(value));
        return sb.toString();
    }
}
