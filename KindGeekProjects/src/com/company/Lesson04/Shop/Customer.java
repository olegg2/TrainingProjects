package com.company.Lesson04.Shop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int balance;
    private int sumOfCommodity;
    private String login;
    private String password;
    private List<Commodity> basket;

    private List<String> history;

    public Customer(String name,String password, int balance) {
        this.name = name;
        this.login=name;
        this.password=password;
        this.balance = balance;
        this.basket = new ArrayList<>();
        sumOfCommodity=0;
        this.history=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Commodity> getBasket() {
        return basket;
    }

    public void setBasket(List<Commodity> basket) {
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSumOfCommodity() {
        return sumOfCommodity;
    }

    public void setSumOfCommodity(int sumOfCommodity) {
        this.sumOfCommodity = sumOfCommodity;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", sum of commodity="+sumOfCommodity +
                ", basket=" + basket +
                "}\n";
    }
}
