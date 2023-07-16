package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.Model.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        Movie[] movie = {
            new Movie("괴물", "봉준호", 2006, "한국"),
            new Movie("기생충", "봉준호", 2019, "한국"),
            new Movie("완벽한 타인", "이채규", 2018, "한국")
        };


        for(int i = 0; i<movie.length; i++) {
            list.add(movie[i]);
        }

        int max_len = getMaxLen(movie);

        System.out.println("+----------------+--------+----------+------+");
        System.out.println("| 영화제목        | 감독   | 개봉년도  | 국가 |");
        System.out.println("+----------------+--------+----------+------+");
        int idx = 0;
        for(Movie m : list) {
            int space = getSpace(m.getTitle(), max_len);
            int len = m.getTitle().length();
            System.out.printf("|%-"+(len+space+6)+"s|%5s|%10d|%4s|\n",
                    m.getTitle(), m.getDirector(), m.getYear(), m.getCountry());
        }
        System.out.println("+----------------+--------+----------+------+");

        String searchTitle = "기생충";
        for(Movie m : list) {
            if(m.getTitle().equals(searchTitle)) {
                System.out.println(searchTitle+"은 존재");
                System.out.println(m);
                break;
            }
        }
    }

    public static int getSpace(String s, int max_len) {
        int len = 0;
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) <= 127) len+=1;
            else len+=2;
        }
        return max_len - len;
    }

    public static int getMaxLen(Movie[] movie) {
        int max_len = 0;
        for(int i = 0; i<movie.length; i++) {
            int len = 0;
            for(int j = 0; j<movie[i].getTitle().length(); j++) {
                if(movie[i].getTitle().charAt(j) <= 127) len+=1;
                else len+=2;
            }
            max_len = Math.max(max_len, len);
        }
        return max_len;
    }
}
