package com.javastudy.API.Utility;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;

    public IntArray() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void add(int element) {
        elements[size++] = element;
    }

    public int get(int index) {
        return elements[index];
    }
    public int size() {
        return size;
    }

}
