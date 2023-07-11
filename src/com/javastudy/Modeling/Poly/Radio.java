package com.javastudy.Modeling.Poly;

public class Radio implements RemoCon{

    @Override
    public void chUp() {
        System.out.println("radio channel up");
    }

    @Override
    public void chDown() {
        System.out.println("radio channel down");
    }

    @Override
    public void VolUp() {
        System.out.println("radio Volume Up");
    }

    @Override
    public void VolDown() {
        System.out.println("radio Volume down");
    }

    @Override
    public void internet() {
        System.out.println("radio는 internet이 없음");
    }
}
