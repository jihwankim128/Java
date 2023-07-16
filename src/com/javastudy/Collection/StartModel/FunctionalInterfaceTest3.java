package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.Model.MathOperation;

public class FunctionalInterfaceTest3 {
    public static void main(String[] args) {
        //익명 내부클래스
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };

        System.out.println(mo.operation(10, 20));
    }
}
