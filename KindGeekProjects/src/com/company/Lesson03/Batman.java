package com.company.Lesson03;

public class Batman implements HeroResponsibility {
    public  String coolName;

    public int levelOfCoolness;

    public Batman(String coolName, int levelOfCoolness) {
        this.coolName = coolName;
        this.levelOfCoolness = levelOfCoolness;
    }

    public String getCoolName() {
        return coolName;
    }

    public void setCoolName(String coolName) {
        this.coolName = coolName;
    }

    public int getLevelOfCoolness() {
        return levelOfCoolness;
    }

    public void setLevelOfCoolness(int levelOfCoolness) {
        this.levelOfCoolness = levelOfCoolness;
    }

    @Override
    public void doSomeSheet() {
        System.out.println("Hero punch oyoyooy!!11!!");
    }
}
