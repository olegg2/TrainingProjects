package com.company.Lesson04.Shop;

public class Commodity {
    public static int numberOfCommodity=0;

    private final int serialNumber;
    private String title;
    private int prize;
    private int weight;

    public Commodity(String title, int prize, int weight) {
        this.title = title;
        this.prize = prize;
        this.weight = weight;
        numberOfCommodity++;
        serialNumber=numberOfCommodity;
    }

    public static int getNumberOfCommodity() {
        return numberOfCommodity;
    }

    public static void setNumberOfCommodity(int numberOfCommodity) {
        Commodity.numberOfCommodity = numberOfCommodity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Commodity №"+serialNumber+"{" +
                "title='" + title + '\'' +
                ", prize=" + prize +
                ", weight=" + weight +
                "}\n";
    }
}
