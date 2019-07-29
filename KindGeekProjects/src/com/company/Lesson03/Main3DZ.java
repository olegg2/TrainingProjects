package com.company.Lesson03;

public class Main3DZ {
    public static void main(String[] args) {
        for (Season val:Season.values()
                ) {
            System.out.println(val);
        }
        System.out.println();

        System.out.println(MyMath.log(4,16));
        System.out.println(MyMath.pow(4,4));
        System.out.println(MyMath.circleLength(5));
        System.out.println(MyMath.circleSquare(1.4));
    }
}
