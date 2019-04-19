package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;
public class Main {


    public static void main(String[] args) {

        ImplEmployee emp1 = new HourEmployee("4","q",12);
        ImplEmployee emp2 = new FixedEmployee("1","q",12);
        ImplEmployee emp3 = new FixedEmployee("1","q",12);


        out.println(emp1);
        out.println(emp2);

        List<ImplEmployee> employees = new ArrayList<>();
        employees.add(emp3);
        employees.add(emp2);
        for (ImplEmployee e:employees
             ) {
            System.out.println(e);
        }

        Collections.sort(employees);

    }
}

 interface Employee{
    double getAverageMonthlySalary();

}

abstract class ImplEmployee implements Employee{

    abstract int compareTo(ImplEmployee o);

}  protected String id;
    protected String name;
    protected double salary;
    protected double monthlySalary;

class HourEmployee extends ImplEmployee{
    HourEmployee(String id,String name,double salary){
        super.id=id;
        super.name=name;
        super.salary=salary;
        super.monthlySalary=getAverageMonthlySalary();
    }
    /**/

    @Override
    public double getAverageMonthlySalary() {
        double res = 20.8*8*salary;
        return res;
    }

    @Override
    public String toString() {
        return "HourEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", monthlySalary=" + monthlySalary +
                '}';
    }


    @Override
    int compareTo(ImplEmployee o) {
        return this.id.compareTo(o.id);
    }
}
/////////////////
class FixedEmployee extends ImplEmployee{

    FixedEmployee(String id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.monthlySalary=getAverageMonthlySalary();
    }
    @Override
    public double getAverageMonthlySalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "FixedEmployee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", monthlySalary=" + monthlySalary +
                '}';
    }


    @Override
    int compareTo(ImplEmployee o) {
        return this.id.compareTo(o.id);
    }
}
