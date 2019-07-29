package com.company.Lesson02;

public class Vegetable {
    private String name;
    private String colour;
    private int weight;

    public Vegetable(String name) {
        this.name = name;
    }

    public Vegetable(String name, String colour, int weight) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
    }

    public void doNothing(){
        System.out.println("oooo vegetable "+name+" do nothing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
