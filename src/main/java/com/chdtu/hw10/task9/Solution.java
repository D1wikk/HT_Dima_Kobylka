package com.chdtu.hw10.task9;

public class Solution {
    public static void main(String[] args) {
        String s1 = "Test";
        //s1 = "Test";
        String s2 = "Test";
        //s2 = new String("Test");
        String s3 = "Test";
        //s3 = new String("Test");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}


