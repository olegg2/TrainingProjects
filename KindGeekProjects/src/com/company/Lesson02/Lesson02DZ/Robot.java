package com.company.Lesson02.Lesson02DZ;

public class Robot {
    private String name;

    public Robot(String name){
        this.name=name;
    }

    public void work(){
        System.out.println("I am Robot "+name+" and I do nothing");
    }

    public String getName() {
        return name;
    }
}
