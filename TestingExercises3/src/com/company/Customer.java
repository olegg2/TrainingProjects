package com.company;

class Customer {
    private String name;
    private double amountForRent;
    // Other fields, constructors, get, set, etc.
    //
    public Customer(String name,Rental rental) {
        this.name=name;
        amountForRent=rental.amountFor();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    // Other methods.

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", amountForRent=" + amountForRent +
                '}';
    }
}


class Rental {
    private int kind;
    private int days;
    // Other fields, constructors, get, set, etc.
    //


    public Rental(int kind, int days) {
        this.kind=kind;
        this.days=days;
    }

    public double amountFor() {
        double result;
        // Another code.
        result=getDays()*getBasePrice();
        if(getDays()>7)
            result*=3;
        switch (getKind()){
            case 1:
                result*=1.5;
                break;
            case 2:
                result*=2;
                break;
            case 3:
                result*=2.5;
        }
        return result;
    }

    public int getKind() {
        return kind;
    }
    public void setKind(int kind) {
        this.kind=kind;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days=days;
    }
    public double getBasePrice() {
        return 4;
        // Calculation of Price.
        // . . .
    }
    // Other methods.
}
