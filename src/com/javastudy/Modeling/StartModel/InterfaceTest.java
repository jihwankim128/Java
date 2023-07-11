package com.javastudy.Modeling.StartModel;

import com.javastudy.Modeling.Poly.Radio;
import com.javastudy.Modeling.Poly.RemoCon;
import com.javastudy.Modeling.Poly.TV;

public class InterfaceTest {
    public static void main(String[] args) {
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.VolUp();
        remo.VolDown();
        remo.internet();

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.VolUp();
        remo.VolDown();
        remo.internet();
    }
}
