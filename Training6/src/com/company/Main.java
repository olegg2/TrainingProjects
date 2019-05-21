package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.print(decode(".... . -.--   .--- ..- -.. ."));
      //  System.out.print(decode("."));
    //sort(new int[]{5,4,3,2,1});
        //System.out.print(order("4of Fo1r pe6ople g3ood th5e the2"));
    }
    public static void sort(int[] array){
        int a;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if(array[i]<array[j]){
                    a = array[i];
                    array[i]=array[j];
                    array[j]=a;
                    System.out.println("array[i] = "+array[i]+" array[j] = "+array[j]);
                }
            }
        }
        for (int j = 0; j <array.length ; j++) {
            System.out.print(array[j]+" ");
        }
    }

    public static String order(String words) {
        if(words.length()<1) return "";
        String[] array = words.split(" ");
        String[] resArray=new String[array.length];
        for (int i = 0; i <array.length; i++) {
            int index= Integer.parseInt(array[i].replaceAll("[^0-9]",""));
            resArray[index-1]=array[i];
        }
        return String.join(" ",resArray);

    }
    public static String decode(String morseCode) {
        if(!morseCode.contains(" "))
            return MorseCode.get(morseCode);
        String[] morse = morseCode.split("   ");
        String res=new String();
        for(int i=0;i<morse.length;i++){
            String[] mor = morse[i].split(" ");
            for (int j = 0; j <mor.length ; j++) {
                res+=MorseCode.get(mor[j]);
            }
            res+=" ";
        }

        return res.trim();
    }
}
