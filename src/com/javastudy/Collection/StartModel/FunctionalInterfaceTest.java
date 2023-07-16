package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.Model.MathOperation;

public class FunctionalInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation m = new FunctionalInterfaceTest();
        int result = m.operation(10, 20);
        System.out.println(result);
    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
