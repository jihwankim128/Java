package com.javastudy.Basic.Array;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        int[][] a = new int[2][4];
        for(int i = 0; i<a.length; i++) {
            for(int j = 0; j<a[i].length; j++) {
                a[i][j] = i+j+1;
            }
        }
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
