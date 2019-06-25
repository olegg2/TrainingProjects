package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Person> set1 = new TreeSet<>();
        set1.add(new  Person("3"));
        set1.add(new  Person("2"));
        set1.add(new  Person("6"));
        set1.add(new  Person("5"));
        for (Object s: set1
             ) {
            System.out.print(s+" ");
        }

    }


}
 class Person implements Comparable<Person>{
    private String name;

    Person(String name){
        this.name=name;
    }

    String getName(){
        return name;
    }
    void setName(String n){
        name=n;
    }

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 '}';
     }

     @Override
     public int compareTo(Person o) {
         return this.name.compareTo(o.name);
     }
 }
