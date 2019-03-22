package com.company;

public class FixedEmployee extends Employee implements EmployeeMethods{
    private int hourWage;
    public FixedEmployee(String id, String name,int hourWage ) {
        super(id, name);
        this.hourWage=hourWage;
        monthWage= giveMonthWage();
        System.out.println(monthWage);
    }

    @Override
    public int giveMonthWage() {
        return  20*8* hourWage;
    }

    @Override
    public String toString() {
        return "FixedEmployee{" +
                "id="+getId()+getName()+
                "hourWage=" + hourWage +
                ", monthWage=" + monthWage +
                '}';
    }
}
