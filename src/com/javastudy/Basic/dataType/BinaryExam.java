package com.javastudy.Basic.dataType;

public class BinaryExam {
    public static void main(String[] args) {
        int data = 123;
        String binary = java.lang.Integer.toBinaryString(data);
        System.out.println("binary = " + binary);
        String octal = java.lang.Integer.toOctalString(data);
        System.out.println("Octal = " + octal);
        String hexa = java.lang.Integer.toHexString(data);
        System.out.println("Hexa = " + hexa);

        int dec = 123;
        int bin = 0b1111011;
        int oct = 0173;
        int hex = 0x7b;
        System.out.println("dec = " + dec);
        System.out.println("bin = " + bin);
        System.out.println("oct = " + oct);
        System.out.println("hex = " + hex);
    }
}
