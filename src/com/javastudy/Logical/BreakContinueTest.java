package com.javastudy.Logical;

public class BreakContinueTest {
    public static void main(String[] args) {
        char[] c = {'s','h','u','t','d','o','w','n'};
        for(int i = 0; i<c.length; i++) {
            if(c[i] == 'o') break;
            System.out.print(c[i]);
        }
        System.out.println();

        int cnt = 0;
        for(int i = 1; i<=10; i++) {
            if(i%3 != 0) continue;
            cnt++;
        }
        System.out.println("3의 배수 = " + cnt + '개');
    }
}
