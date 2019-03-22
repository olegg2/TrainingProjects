package com.company;

public class Employee implements EmployeeMethods,Comparable<Employee> {
    private String id;
    private String name;
    protected int monthWage;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthWage() {
        return monthWage;
    }

    public void setMonthWage(int monthWage) {
        this.monthWage = monthWage;
    }


    @Override
    public int giveMonthWage() {
        return 0;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}
