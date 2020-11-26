package edu.epam.task2.entity;

import java.util.Arrays;

public class JaggedArray {
    private int[][] value;

    public JaggedArray(int[][] value) {
        this.value = value;
    }

    public int getNumber(int i, int j) {
        if ((i < 0 || i >= value.length) || (j < 0 || j > value[i].length)) {
            throw new IndexOutOfBoundsException();
        } else {
            return value[i][j];
        }
    }

    public void setNumber(int i, int j, int element) {
        if ((i < 0 || i >= value.length) || (j < 0 || j > value[i].length)) {
            throw new IndexOutOfBoundsException();
        } else {
            value[i][j] = element;
        }
    }

    public int[][] getValue() {
        int[][] numbersTake= Arrays.copyOf(this.value, this.value.length);
        return numbersTake;
    }

    public void setValue(int[][] value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JaggedArray that = (JaggedArray) o;

        return Arrays.deepEquals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("JaggedArray{");
        sb.append("value=").append(Arrays.toString(value)).append('}');
        return sb.toString();
    }
}
