package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*Integer as = new Integer(11);
	double a=Math.rint(12.56);
		double b=5;
	System.out.format("double a = %f%n"+"dsa= %f%n",a,b);
		String base5String = "230";
		int result = Integer.valueOf(base5String,16);
	System.out.println(Integer.valueOf(1).equals(Float.valueOf(1)));
*/
	/*System.out.println("dsfds\baaaa");
	String myStr="string";
	char[] array=new char[6];
	array[0]='e';
	myStr.getChars(1,6,array,1);
	System.out.println(array);*/
		System.out.println(    ("        My name       is ".concat("Rumplestiltskin")).trim()    );
		String s = "sdflafgh";
		String s2 = s.substring(1,4);
		System.out.println(s.lastIndexOf('a'));
		String s4= "dsfsdf";
		String s5 = "4.6";
		Float a3= Float.valueOf(s5);
		Float a4 = Float.parseFloat(s5);

		String[] a = s4.split("s",2);

		String s6=s4.replace("ds","lox");
		System.out.println(s6);
    }
}
