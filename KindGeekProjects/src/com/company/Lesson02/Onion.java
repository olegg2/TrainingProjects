package com.company.Lesson02;

public class Onion extends Vegetable {
    public Onion(String name, String colour, int weight) {
        super(name, colour, weight);
    }

    public void stink(){
        System.out.println("onion "+super.getName()+" stinks");

    }
}
