package com.company;

import java.util.Arrays;

public class Anagram {
  static  private String letterSequence1;
  static  private String letterSequence2;


    static public boolean areAnagrams(String str1,String str2){
        letterSequence1=sortAndFormatString(removeNotLetters(str1));
        letterSequence2=sortAndFormatString(removeNotLetters(str2));
        if(letterSequence1.compareTo(letterSequence2)==0){return true;} else return false;
    }


   static private String removeNotLetters(String str){
        StringBuilder stringBuilder= new StringBuilder();
        char[] array= str.toCharArray();
        for (int i=0;i<str.length();i++){
            if(Character.isLetter(array[i])){
                stringBuilder.append(array[i]);
            }
        }
        System.out.println("my str="+stringBuilder.toString());
        return stringBuilder.toString();
    }

  static private String sortAndFormatString(String str){
        str.toLowerCase();
        char[] array = str.toCharArray();
        Arrays.sort(array);
        String s = new String(array);
      System.out.println("my array="+s);
        return s;

    }
}
