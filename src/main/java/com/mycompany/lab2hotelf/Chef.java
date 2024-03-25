package com.mycompany.lab2hotelf;

public class Chef extends Employee{
    private String nationality;
    
    public Chef(String nationality, String location, String position, String shift, String name, String id) {
        super(location, position, shift, name, id);
        this.nationality = nationality;
    }
    
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
