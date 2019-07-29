package com.company.Lesson03;

public class MyMath {
    public static final double PI = 3.141;
    public static final double E = 2.718281828;

    public static int sum(int a,int b){
        return a+b;
    }

    public static double log(double a,double b){
        return Math.log10(b)/Math.log10(a);
    }

    public static int pow(int number , int power){
        int res=number;
        for (int i = 2; i <=power ; i++) {
            res*=number;
        }
        return res;
    }

    public static double circleSquare(double r){
        return PI*(r*r);
    }

    public static double circleLength(double r){
        return 2*PI*r;
    }
}
