package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        A a = new A();
        Object obj = new A(); //UpCasting
        a.Display();
        ((A)obj).Display(); // DownCasting
    }
}
