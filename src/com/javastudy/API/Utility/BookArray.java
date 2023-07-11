package com.javastudy.API.Utility;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;

    public IntArray() {
        elements = new int[DEFAULT_CAPACITY];
    }


    public void add(int element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public int get(int index) {
        return elements[index];
    }
    public int size() {
        return size;
    }

}
