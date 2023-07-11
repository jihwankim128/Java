package com.javastudy.API.Utility;

import com.javastudy.API.Model.Book;

import java.util.Arrays;

//IntArray에서 자료형만 바뀜.
//Object를 이용하면 범용적. -> 확장성이 좋다는 말.
//Object는 모든 Class의 부모이기 때문에.
public class BookArray {
    private static final int DEFAULT_CAPACITY = 5;
    private Book[] elements;
    private int size = 0;

    public BookArray() {
        elements = new Book[DEFAULT_CAPACITY];
    }


    public void add(Book element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length*2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public Book get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("현재 " + 0
            + " ~ " + (size-1) + "번 index까지 존재합니다.");
        }
        return elements[index];
    }
    public int size() {
        return size;
    }

}
