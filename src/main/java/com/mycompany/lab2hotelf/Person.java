package com.mycompany.lab2hotelf;

public class Person {
    static Reading in = new Reading();
    static Hotel hotel = new Hotel();
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
