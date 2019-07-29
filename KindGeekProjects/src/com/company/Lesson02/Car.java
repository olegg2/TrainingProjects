package com.company.Lesson02;

public class Car {
    private String name;
    private int power;
    //default
    public Car(){

    }

    public Car(String name,int power){
        this.name=name;
        this.power=power;
    }

    public void drive(){
        System.out.println("vru-vru "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
