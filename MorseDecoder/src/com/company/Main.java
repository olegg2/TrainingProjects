package com.company;

public class Main {

    public static void main(String[] args) {
        String i = "qwerty";
        char [] c = i.toCharArray();
        char [] c2 = new char[i.length()];


        for (int j = 0; j <i.length() ; j++) {
            c2[j] = c[i.length()-1-j];
        }
        System.out.println(new String(c2));
    }
}
