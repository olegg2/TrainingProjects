package com.company;
import java.util.ArrayList;
import java.util.List;

import static com.company.PrintMethod.*;
public class Main {

    public static void main(String[] args) {
	/*Box<Double> box1= new Box<Double>(12d,12d,12d);
	System.out.println(box1);
	pr(box1);
	pr(Box.<Integer>compareParameters(5,5));
	String str1 ="1";
	int a = Integer.parseInt(str1);
		List <Number> aa = new ArrayList<>();
		aa.add((int)4);*/
		List<Integer> myList = new ArrayList<>();
		myList.add(12);
		myList.add(13);
		myList.add(12);
		myList.add(12);
		myList.add(12);
	Box.printLine(myList);
    }
}
