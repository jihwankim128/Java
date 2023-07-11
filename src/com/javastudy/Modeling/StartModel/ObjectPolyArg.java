package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Poly.A;
import com.javastudy.Modeling.Poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Display(a);
        Display(b);
    }

    public static void Display(Object obj) {
        if(obj instanceof A) {
            ((A) obj).Display();
        }
        else {
            ((B) obj).Display();
        }
    }
}
