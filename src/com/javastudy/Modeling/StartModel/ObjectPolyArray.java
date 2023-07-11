package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Poly.A;
import com.javastudy.Modeling.Poly.B;

public class ObjectPolyArray {
    public static void main(String[] args) {
        Object[] obj = new Object[2];
        obj[0] = new A();
        obj[1] = new B();
        Display(obj);
    }
    public static void Display(Object[] obj) {
        for(int i = 0; i<obj.length; i++) {
            if(obj[i] instanceof A) ((A) obj[i]).Display();
            if(obj[i] instanceof B) ((B) obj[i]).Display();
        }
    }
}
