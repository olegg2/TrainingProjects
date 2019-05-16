package com.company;

import java.io.Serializable;

public abstract class Employee implements Serializable{
    public static int idCount;
    protected int id;
    protected String name;
    protected double salary;
    protected double monthlySalary;
   abstract double getAverageMonthlySalary();
   Employee(){
       idCount++;
       id=idCount;

   }
   abstract int getId();
   abstract String getName();
   abstract double getSalary();
}
