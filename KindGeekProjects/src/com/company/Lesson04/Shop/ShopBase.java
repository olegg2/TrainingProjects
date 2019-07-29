package com.company.Lesson04.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShopBase {
    private String name;
    private List<Commodity> listOfCommodity;
    private List<Customer> listOfCustomers;

    public ShopBase(String name) {
        this.name = name;
        listOfCommodity = new ArrayList<>();
        listOfCustomers = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Commodity> getListOfCommodity() {
        return listOfCommodity;
    }

    public void setListOfCommodity(List<Commodity> listOfCommodity) {
        this.listOfCommodity = listOfCommodity;
    }

    public List<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(List<Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }

    @Override
    public String toString() {
        return "ShopBase{" +
                "name='" + name + '\'' +
                ", listOfCommodity=" + listOfCommodity +
                ",\n listOfCustomers=" + listOfCustomers +
                '}';
    }
}
