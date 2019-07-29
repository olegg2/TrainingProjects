package com.company.Lesson03;

public abstract class Hero {
    public String name;
    public int age;

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract  void doSmth();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
