package com.mycompany.lab2hotelf;

public class Food {
    private String name;
    private double price;
    private String chefNationality;

    public Food(String name, double price, String chefNationality) {
        this.name = name;
        this.price = price;
        this.chefNationality = chefNationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getChefNationality() {
        return chefNationality;
    }

    public void setChefNationality(String chefNationality) {
        this.chefNationality = chefNationality;
    } 
}
