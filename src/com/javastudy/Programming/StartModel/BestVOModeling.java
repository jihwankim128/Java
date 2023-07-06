package com.javastudy.Programming.StartModel;

import com.javastudy.Programming.Model.MovieDTO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieDTO mv = new MovieDTO();
        mv.setTitle("아바타");
        mv.setDay("2022.12.14");
        mv.setActor("제이크 설리");
        mv.setGenre("액션");
        mv.setTime(192);
        mv.setMinAge(12);

        System.out.println(mv);
    }
}
