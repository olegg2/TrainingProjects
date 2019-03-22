package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

       /*  Customer customer1 = new Customer("lol",new Rental(5,8));
         System.out.println(customer1);*/

        List<Employee> employees = new ArrayList<>();
        employees.add(new FixedEmployee("1", "a", 5));
        employees.add(new FixedEmployee("2", "b", 5));
        employees.add(new HourEmployee("3", "c", 50));
        employees.add(new FixedEmployee("4", "d", 5));
        employees.add(new FixedEmployee("5", "e", 5));
        employees.add(new HourEmployee("6", "f", 52));
        employees.add(new HourEmployee("7", "g", 45));

        for (Employee e : employees
                ) {
            System.out.println(e);
        }

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int res =o2.getMonthWage() - o1.getMonthWage();
                if(res==0){

                }
                return res;
            }
        });
        for (Employee e : employees
                ) {
            System.out.println("\n"+e);
        }
    }
}