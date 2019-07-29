package com.company.Lesson02.Lesson02DZ;

public class RobotDancer extends Robot {
    public RobotDancer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("I am Robot Dancer "+super.getName()+" and Chiki-Briki patsanu");
    }
}
