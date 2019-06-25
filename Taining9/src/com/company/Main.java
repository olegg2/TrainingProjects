package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        long [] array =productFib(800);
//       System.out.println(array[0]+" "+array[1]+" "+array[2]);
//
       System.out.println( pigIt("mama am gaga"));
	   /* String text = "I am superman";
        Pattern pattern1 = Pattern.compile("[1-9]");
        Matcher matcher = pattern1.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(),matcher.end()));
        }*/
        //System.out.print();
    }
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }


    public static long[] productFib(long prod) {
        long num1=0;
        long num2=1;
        long sum=num1+num2;
        while(num1*num2<prod){
            num1=num2;
            num2=sum;
            sum=num1+num2;
        }
        if(num1*num2==prod)
            return new long[]{num1,num2,1};

        return new long[]{num1,num2,0};


    }


}
