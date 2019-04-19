package com.company;

public class HourEmployee extends Employee{

    HourEmployee(String name,double salary){

        this.name=name;
        this.salary=salary;
        this.monthlySalary=getAverageMonthlySalary();
    }
    /**/


    public double getAverageMonthlySalary() {
        double res = 20.8*8*salary;
        return res;
    }

    @Override
    int getId() {
        return id;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "HourEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", monthlySalary=" + monthlySalary +
                "}\n";
    }



}
