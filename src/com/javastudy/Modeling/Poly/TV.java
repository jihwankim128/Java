package com.javastudy.Modeling.Poly;

public class TV implements RemoCon{
    private int ch = 10;
    @Override
    public void chUp() {
        if(++ch > RemoCon.MAXCH) ch = 1;
        System.out.println("TV channel up");
    }

    @Override
    public void chDown() {
        if(--ch < RemoCon.MINCH) ch = 99;
        System.out.println("TV channel dwon");
    }

    @Override
    public void VolUp() {
        System.out.println("TV Volume Up");
    }

    @Override
    public void VolDown() {
        System.out.println("TV Volume dwon");
    }

    @Override
    public void internet() {
        System.out.println("인터넷 실행");
    }
}
