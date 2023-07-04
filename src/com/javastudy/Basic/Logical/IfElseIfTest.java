package com.javastudy.Basic.Logical;

public class IfElseIfTest {
    public static void main(String[] args) {
        int[] student_Score = {50, 100, 86, 83};
        for(int i = 0; i<student_Score.length; i++) {
            if(student_Score[i] >= 90)
                System.out.println((i+1) + "번 학생 " +
                        student_Score[i] + "점 - A반");
            else if(student_Score[i] >= 85)
                System.out.println((i+1) + "번 학생 " +
                        student_Score[i] +"점- B반");
            else if(student_Score[i] >= 80)
                System.out.println((i+1) + "번 학생 " +
                        student_Score[i] + "점 - C반");
            else
                System.out.println((i+1) + "번 학생은 " +
                        student_Score[i] + "점으로 불합격");
        }
    }
}
