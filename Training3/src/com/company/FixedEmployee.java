package com.company;

public class FixedEmployee extends Employee {



    FixedEmployee(String name,double salary){

        this.name=name;
        this.salary=salary;
        this.monthlySalary=getAverageMonthlySalary();
    }

    public double getAverageMonthlySalary() {
        return this.salary;
    }

    @Override
    int getId() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }

    @Override
    double getSalary() {
        return 0;
    }

    @Override
    public String toString() {
        return "FixedEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", monthlySalary=" + monthlySalary +
                "}\n";
    }




}
