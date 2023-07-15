package com.javastudy.API.StartModel;

import com.javastudy.API.Model.A;
import com.javastudy.API.Model.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("자바", 15000,
                "한빛", "홍길동"));
        list.add(new Book("C++", 17000,
                "대림", "이길동"));
        list.add(new Book("Python", 16000,
                "정보", "나길동"));

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
