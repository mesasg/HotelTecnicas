/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2hotelf;

/**
 *
 * @author saram
 */
public class Manager extends Employee{
    Reading in = new Reading();
    Shifts shifts = new Shifts();
    private String phoneNo;
    private int cantStaff;

    public Manager(String name, String id,String phoneNo, String location, String position, String shift) {
        super(location, position, shift, name, id);
        this.phoneNo = phoneNo;
    }

    public void manageStaff() {
        cantStaff = in.readAndValidateInt("¿A cuantos empleados deseas asignar?");
        shifts.assignShifts(cantStaff);
    }
    
    public void recordComplaints(){
        //recibir del recepcionista?
    }
    
    public void purchaseInventory(){
        //comida? relacionado con los foos items?
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Manager{");
        sb.append("phoneNo=").append(phoneNo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
