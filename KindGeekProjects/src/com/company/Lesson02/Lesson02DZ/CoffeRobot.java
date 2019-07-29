package com.company.Lesson02.Lesson02DZ;

public class CoffeRobot extends Robot {

    public CoffeRobot(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("I am Coffe Robot"+super.getName()+" and I AM SPEEEEEEEDDD");
    }
}
