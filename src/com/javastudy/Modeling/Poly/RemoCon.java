package com.javastudy.Modeling.Poly;

//추상 클래스 = 추상 메서드 + 구현 메서드
//비슷한 기능의 자식을 가져야함.
public interface RemoCon {
    public int MAXCH = 99;
    public int MINCH = 1;
    public void chUp();
    public void chDown();
    public void VolUp();
    public void VolDown();
    public void internet();
}
