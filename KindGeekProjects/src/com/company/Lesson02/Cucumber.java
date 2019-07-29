package com.company.Lesson02;

public class Cucumber extends Vegetable {
    private String taste;
    public Cucumber(String name, String colour, int weight,String taste) {
        super(name, colour, weight);
        this.taste=taste;
    }

    public void givePowerOfEarth(String practioner){
        System.out.println("Power of earth is given from "+" cucumber "+super.getName()+" to the practioner "+practioner);
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "taste='" + taste + '\'' +
                '}';
    }
}
