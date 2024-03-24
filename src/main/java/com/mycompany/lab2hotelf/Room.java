package com.mycompany.lab2hotelf;

public class Room {
    private String roomNo;
    private String location;
    private String type;
    private int capacity;
    private double pricePerHour;
    private boolean clean;
    private boolean available;
    private Guest guest;

    //Constructors
    public Room() {
    }
    
    public Room(String roomNo, String location, String type, int capacity, double pricePerHour, boolean clean, boolean available, Guest guest) {
        this.roomNo = roomNo;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
        this.pricePerHour = pricePerHour;
        this.clean = clean;
        this.available = available;
        this.guest = guest;
    }
    
    //Getters and setters
    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    
    @Override
    public String toString() {
        return "Información de la habitación #" + roomNo 
                + ": \n Ubicación: " + location 
                + "\n Tipo: " + type 
                + "\n Capacidad: " + capacity 
                + "\n ¿Está Limpia?: " + (clean ? ("Sí"):("No")) 
                + "\n ¿Está disponible?: " + (available ? ("Sí"):("No"));
    }
}
