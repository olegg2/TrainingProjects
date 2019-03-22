package com.company;

public class HourEmployee extends Employee {
    private int fixedWage;
    public HourEmployee(String id, String name,int fixedWage) {
        super(id, name);
        this.fixedWage=fixedWage;
        monthWage = giveMonthWage();
    }

    @Override
    public int giveMonthWage() {
        return fixedWage;
    }

    @Override
    public String toString() {
        return "HourEmployee{" +
                "id="+getId()+getName()+
                "fixedWage=" + fixedWage +
                ", monthWage=" + monthWage +
                '}';
    }
}
