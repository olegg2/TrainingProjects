package com.company;

import java.util.HashSet;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws Exception {
        int[] array = new int[10];
        array[0] = 1;
        System.out.println(array[1]);
        method(array);
        System.out.println(array[0]);
        String a = "asd";
       // a.length();

       Integer ad =1;



        Vector data = new Vector();
        data.add("apple");
        data.add("mango");
        data.add("papaya");
        data.add("cherry");
        data.add("banana");
        data.add("apple");
        System.out.println(getData(data));
    }


    static Vector getData(Vector v)  {
        return new Vector(new HashSet(v));
    }


    static void method(int[] a) {
        a[0] = 10;
    }

}