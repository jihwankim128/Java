package com.javastudy.Collection.StartModel;

import com.javastudy.Collection.Model.MathOperation;
import com.javastudy.Collection.Model.MathOperationImpl;

public class FunctionalInterfaceTest2 {
    public static void main(String[] args) {
        MathOperation m = new MathOperationImpl();
        System.out.println(m.operation(10, 20));
    }
}
