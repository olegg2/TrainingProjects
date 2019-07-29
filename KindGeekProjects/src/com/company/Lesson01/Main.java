package com.company.Lesson01;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      /*  System.out.print("lalala");
        System.out.println("\n"+(2+3));
        int i=4;

        if(i%2==0){
            System.out.println("parn");
        }else
            System.out.println("ne parn");

        String str = "qw\n";
        System.out.print(str.length());*/

       /* Scanner sc = new Scanner(System.in);
        String w="d";
        switch (w){
            case "as":{
                System.out.println("1");
                break;
            }
            case "dds":{
                System.out.println("1");
                break;
            }
            case "asd":{
                System.out.println("1");
                break;
            }*/
        int arr[] = new int[10];
        Random rand = new Random();
        int max=arr[0];
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(10);
            System.out.println(arr[i]);
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);


    }
}
//дз :



