package com.company.Lesson04.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainShop {
    private static Scanner sc=new Scanner(System.in);
    private static ShopBase shopBase= new ShopBase("Kaska");
    private static Customer currentCustomer;
    private static Admin admin;
    static boolean isCustomer;

    static void error(){
        System.out.println("Error");
    }
    public static void main(String[] args) {
        addRandomVegetables(20);
        showRegistration();

        //showListOfCustomers();
       // showListOfCommodity();


    }
////////registration
    static void showRegistration(){//+
        System.out.println("Choose: \n" +
                "1.Customer\n2.Admin\n3.Register");
        int choice=0;
        try{
            choice=Integer.parseInt(sc.next());
            switch (choice){
                case 1:
                    accessCustomer();
                    break;
                case 2:
                    accessAdmin();
                    break;
                case 3:
                    registerCustomer();
                    break;
                default:{error();showRegistration();}

            }
        }catch (Exception e){
            error();
            showRegistration();
        }


    }

    static void accessAdmin(){//+
        showAdminMenu();
    }


    static void registerCustomer(){//+
        System.out.println("please print login, password and balance");
        String login="";
        String password="";
        int balance=0;
        try{
            login=sc.next();
            password=sc.next();
            balance=sc.nextInt();
        }catch (Exception e){error();registerCustomer();}

        currentCustomer = new Customer(login,password,balance);
        shopBase.getListOfCustomers().add(currentCustomer);
        System.out.println("You entered successfully");
        showUserMenu();
    }

    static void accessCustomer(){//+
        System.out.println("print your login and password or press \"x\" to return");
        String login="";
        String password="";
        try {

            login=sc.next();
            if(login.equals("x")||login.equals("X")) {
                System.out.println("Returning...");
                showRegistration();
            }
            password=sc.next();
        }catch (Exception e){accessCustomer();}
        int count=0;
        for (int i = 0; i <shopBase.getListOfCustomers().size() ; i++) {
            if (shopBase.getListOfCustomers().get(i).getName().equals(login) && shopBase.getListOfCustomers().get(i).getPassword().equals(password)) {
                currentCustomer = shopBase.getListOfCustomers().get(i);
                System.out.println("you successfully entered");
                count=1;
                showUserMenu();
            }
        }
        if(count==0){
            System.out.println("Error");
            accessCustomer();
        }
    }


/////////////////////////////
//show

    static void showAdminMenu(){//+
        System.out.println("1.Choose commodity to delete from shop\n" + "2.Choose customer to delete from shop\n"+
              "3.Watch customers history\n"+  "4.Change User\n"+"5.End session");
        int count=0;
        try{
            count = sc.nextInt();
        }catch (Exception e){showAdminMenu();}
        switch (count) {
            case 1:
                deleteCommodityFromShop();
                break;
            case 2:
                deleteCustomerFromShop();
                break;
            case 3:
                getUserHistory();
                break;
            case 4:
                changeUser();
                break;
            case 5:
                System.exit(1);
                break;
            default: {
                System.out.println("Error");
                showAdminMenu();
            }
        }

    }
    static void getUserHistory(){
        showListOfCustomers();

        String cont="";
        while(true) {
            try {
                System.out.println("Pick the customer or press \"x\" to exit");
                cont=sc.next();
                if(isNumeric(cont)) {
                    //shopBase.getListOfCommodity().remove(Integer.parseInt(cont)-1);
                   System.out.println(" | "+ shopBase.getListOfCustomers().get(Integer.parseInt(cont)-1).getHistory()+" | ");
                   // System.out.println("commodity is deleted");
                }else if(cont.equals("X")||cont.equals("x")){
                    System.out.println("You went out");
                    showAdminMenu();}
            } catch (Exception e) {
                System.out.println("Error");
                getUserHistory();
            }
        }
    }

    static void deleteCommodityFromShop(){//+
        showListOfCommodity();
        String cont="";
        while(true) {
            try {
                System.out.println("Please write number of commodity to delete or press \"x\" to exit");
                cont=sc.next();
                if(isNumeric(cont)) {
                    shopBase.getListOfCommodity().remove(Integer.parseInt(cont)-1);
                    System.out.println("commodity is deleted");
                }else if(cont.equals("X")||cont.equals("x")){
                    System.out.println("You went out");
                    showAdminMenu();}
            } catch (Exception e) {
                System.out.println("Error");
                deleteCommodityFromShop();
            }
        }

    }

    static void deleteCustomerFromShop(){//+
        showListOfCustomers();
        String cont="";
        while(true) {
            try {
                System.out.println("Please write number of customer to delete or press \"x\" to exit");
                cont=sc.next();
                if(isNumeric(cont)) {
                    shopBase.getListOfCustomers().remove(Integer.parseInt(cont)-1);
                    System.out.println("customer is deleted");
                }else if(cont.equals("X")||cont.equals("x")){
                    System.out.println("You went out");
                    showAdminMenu();}
            } catch (Exception e) {
                System.out.println("Error");
                deleteCustomerFromShop();
            }
        }

    }




     static void showUserMenu(){//+
        System.out.println("1.Choose commodity to add in the basket\n" + "2.Show your information\n"+
               "3.Delete commodity from your basket\n"+ "4.Confirm transaction\n"+"5.Change the user\n"+"6.End session");
         int count=0;
        try{
             count = Integer.parseInt(sc.next());
        }catch (Exception e){error();showUserMenu();}
        switch (count){
            case 1:
                addCommodityToBasket();
                break;
            case 2:
                showCurrentCustomerInformation();
                break;
            case 3:
                deleteCommodityFromBasket();
                break;
            case 4:
                confirmTransaction();
                break;
            case 5:
                changeUser();
                break;
            case 6:
                System.exit(1);
                break;
                default: {
                    System.out.println("Error");
                    showUserMenu();
                }

        }
     }


     static void addCommodityToBasket(){//+
         showListOfCommodity();
        Commodity commodity=null;
        String cont="";
        while(true) {
            try {
                System.out.println("Please write number of commodity to add or press \"x\" to exit");
                cont=sc.next();
            } catch (Exception e) {
                System.out.println("Error");
                addCommodityToBasket();
            }
            if(isNumeric(cont)) {
                commodity = shopBase.getListOfCommodity().get(Integer.parseInt(cont)-1);
                currentCustomer.getBasket().add(commodity);
                currentCustomer.setSumOfCommodity(currentCustomer.getSumOfCommodity()+commodity.getPrize());
                //
                System.out.println(commodity.getTitle() + " is added");
            }else if(cont.equals("X")||cont.equals("x")){
                System.out.println("You went out");
                showUserMenu();
            }else {System.out.println("incorrect symbol");addCommodityToBasket();}
        }

     }

     static boolean isNumeric(String strNum) {//+
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    static void confirmTransaction(){
        System.out.println("Your current balance is "+currentCustomer.getBalance()+
                "\nYour current sum of commodity is "+currentCustomer.getSumOfCommodity());
        System.out.println("To confirm transaction press \"c\",to continue shopping press \"x\"");
        String button="";
        try {
            button=sc.next();
        }catch (Exception e){System.out.println("incorrect symbol"); confirmTransaction();}
        if(button.equals("c")||button.equals("C")){
            System.out.println("processing...");
            if(currentCustomer.getBalance()-currentCustomer.getSumOfCommodity()>0){
                currentCustomer.setBalance(currentCustomer.getBalance()-currentCustomer.getSumOfCommodity());
                System.out.println("Transaction confirmed");
                currentCustomer.setSumOfCommodity(0);
                currentCustomer.getHistory().add(Arrays.toString(currentCustomer.getBasket().toArray()));
                currentCustomer.setBasket(new ArrayList<>());
                showUserMenu();
            }else {
                error();showUserMenu();
            }

        }else if(button.equals("x")||button.equals("X")){
                System.out.println("Returning to the shop...");
                showUserMenu();
            }else {System.out.println("incorrect symbol"); confirmTransaction();}

    }

    static void deleteCommodityFromBasket(){//+
        System.out.println(currentCustomer.getBasket());

        String cont="";
        while(true) {
            try {
                System.out.println("Please write number of commodity to delete or press \"x\" to exit");
                cont=sc.next();
                if(isNumeric(cont)) {
                    //shopBase.getListOfCommodity().remove(cont);
                    currentCustomer.setSumOfCommodity(currentCustomer.getSumOfCommodity()-currentCustomer.getBasket().get(Integer.parseInt(cont)-1).getPrize());
                    currentCustomer.getBasket().remove(Integer.parseInt(cont)-1);
                        System.out.println("commodity is deleted");
                }else if(cont.equals("X")||cont.equals("x")){
                    System.out.println("You went out");
                    showUserMenu();}
            } catch (Exception e) {
                System.out.println("Error");
                deleteCommodityFromBasket();
            }
        }

    }


    //show list
     static void showListOfCustomers(){//+
       System.out.println( shopBase.getListOfCustomers());
     }
     static void showListOfCommodity(){//+
        System.out.println(shopBase.getListOfCommodity());
     }

     static void showCurrentCustomerInformation(){//+
        System.out.println(currentCustomer);
        showUserMenu();
     }

     static void changeUser(){//+
        currentCustomer=null;
        admin=null;
        showRegistration();
     }
     //add
     static void addRandomVegetables(int count){//+
         Random rand = new Random();
         for (int i = 0; i <count ; i++) {
             String title = CommodityList.values()[rand.nextInt(CommodityList.values().length)].name()+(i+1);
             shopBase.getListOfCommodity().add(new Commodity(title,i+1,(i*5)+100));
         }
     }

}
