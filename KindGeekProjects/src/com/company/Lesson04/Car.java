package com.company.Lesson04;

public class Car {
    private int weight;
    private String name;
    private TypeOfCar type;
    private Motor motor;

    public Car(int weight, String name,TypeOfCar type) {
        this.weight = weight;
        this.name = name;
        switch (type) {
            case AUDI:
                this.motor = new Motor(123);
                break;
            case SEDAN:
                this.motor = new Motor(111);
                break;
            default:
                this.motor = new Motor(228);


        }
    }

        public void ride(){

    }


}
