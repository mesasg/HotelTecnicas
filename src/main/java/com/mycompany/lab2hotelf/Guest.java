package com.mycompany.lab2hotelf;

public class Guest extends Person {
    private String phoneNo;
    private String address;
    private Room room;
    
    public Guest(String name, String id,String phoneNo, String address, Room room) {
        super(name, id);
        this.phoneNo = phoneNo;
        this.address = address;
        this.room = room;
    }
    
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guest{");
        sb.append("phoneNo=").append(phoneNo);
        sb.append(", Address=").append(address);
        sb.append(", room=").append(room.getRoomNo());
        sb.append('}');
        return sb.toString();
    }
    
    
}
