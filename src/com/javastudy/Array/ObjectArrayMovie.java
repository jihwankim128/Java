package com.javastudy.Array;
import com.javastudy.UDDT.Book;
import com.javastudy.UDDT.Movie;

public class ObjectArrayMovie {
    public static void main(String[] args) {
        Movie[] m = new Movie[3];
        String[] title = {"아바타", "공룡", "회사"};
        String[] open = {"2022.12.14", "2020.01.01",
                "2000.05.29"};
        String[] mainActor = {"제이크 설리", "티라노", "패캠"};
        String[] genre = {"액션", "쥐라기", "교육"};
        int[] time = {192, 50, 10};
        String[] age = {"12세", "0세", "19세"};

        for(int i = 0; i<m.length; i++) {
            m[i] = new Movie();
            m[i].title = title[i];
            m[i].open = open[i];
            m[i].mainActor = mainActor[i];
            m[i].genre = genre[i];
            m[i].time = time[i];
            m[i].age = age[i];
        }

        for(int i = 0; i<m.length; i++) {
            System.out.println(m[i].title + "\t" + m[i].open
                    + "\t" + m[i].mainActor + "\t" + m[i].genre
                    + "\t" + m[i].time + "\t" + m[i].age);
        }
    }
}

