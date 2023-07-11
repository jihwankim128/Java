package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Object board = new Board();
        ((Board) board).setTitle("게시글입니다.");
        ((Board) board).getTitle();
        System.out.println(board);
    }
}
