package com.company.Lesson02.Lesson02DZ;

public class RobotCooker extends  Robot{
    public RobotCooker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("I am Robot Cooker "+super.getName()+" and do you want some METT?");
    }
}
