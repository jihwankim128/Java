package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.Model.Movie;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        Movie[] movie = {
            new Movie("괴물", "봉준호", 2006, "한국")
        };
    }
}
