/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2hotelf;

/**
 *
 * @author saram
 */
public class Receptionist extends Employee {
    private String phoneNo;

    public Receptionist(String name, String id,String phoneNo, String location, String position, String shift ) {
        super(location, position, shift, name, id);
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public void checkRoomAvailability(){
        
    }
    public void bookRoom(){
        //array de habitaciones con bool de si esta true esta tomada y fals esta disponible
        
    }
    public void generateBill(){
        
    }
    public void acceptCustomerFeedback(){
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receptionist{");
        sb.append("phoneNo=").append(phoneNo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
