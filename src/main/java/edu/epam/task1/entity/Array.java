package edu.epam.task1.entity;

import java.util.Arrays;

public class Array {
    private int[] value;

    public Array() {}

    public Array(int size) {
        this.value = new int[size];
    }

    public Array(int ... value) {
        this.value = value;
    }

    public int get(int i) {
        return value[i];
    }

    public void set(int i, int element) {
        value[i] = element;
    }

    public int size() {
        return value.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Array array = (Array) o;

        return Arrays.equals(value, array.value);
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
