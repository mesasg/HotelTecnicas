package com.mycompany.lab2hotelf;

public class Guest extends Person {
    private String phoneNo;
    private String address;
    private String roomNo;

    public Guest(String name, String id,String phoneNo, String address, String roomNo) {
        super(name, id);
        this.phoneNo = phoneNo;
        this.address = address;
        this.roomNo = roomNo;
    }
    
    public void checkIn(String name,String roomNo){
        
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

    public String getRoom() {
        return roomNo;
    }

    public void setRoom(String roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guest{");
        sb.append("phoneNo=").append(phoneNo);
        sb.append(", Address=").append(address);
        sb.append(", room=").append(roomNo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
