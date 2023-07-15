package com.javastudy.API.StartModel;

import com.javastudy.API.Model.A;
import com.javastudy.API.Model.B;
import com.javastudy.API.Model.C;
import com.javastudy.API.Utility.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        ObjectArray list = new ObjectArray();
        list.add(new A());
        list.add(new B());
        list.add(new C());

        for(int i = 0; i< list.size(); i++) {
            if(list.get(i) instanceof A) {
                ((A)list.get(i)).print();
            }
            else if(list.get(i) instanceof B) {
                ((B)list.get(i)).print();
            }
            else {
                ((C)list.get(i)).print();
            }
        }
    }
}
