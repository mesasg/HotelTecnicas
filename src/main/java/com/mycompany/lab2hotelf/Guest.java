/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2hotelf;

/**
 *
 * @author saram
 */
public class Guest extends Person {
    private String phoneNo;
    private String Address;
    private String room;

    public Guest(String phoneNo, String Address, String room, String name, String id) {
        super(name, id);
        this.phoneNo = phoneNo;
        this.Address = Address;
        this.room = room;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guest{");
        sb.append("phoneNo=").append(phoneNo);
        sb.append(", Address=").append(Address);
        sb.append(", room=").append(room);
        sb.append('}');
        return sb.toString();
    }
    
    
}
