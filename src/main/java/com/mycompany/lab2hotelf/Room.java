package com.mycompany.lab2hotelf;

public class Room {
    private String roomNo;
    private String location;
    private String type;
    private int capacity;
    private boolean clean;
    private boolean available;

    //Constructors
    public Room() {
    }

    public Room(String roomNo, String location, String type, int capacity, boolean clean, boolean available) {
        this.roomNo = roomNo;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
        this.clean = clean;
        this.available = available;
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
}
