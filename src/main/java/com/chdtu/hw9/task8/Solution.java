package com.chdtu.hw9.task8;

public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    public static void setValues(long value){
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}

