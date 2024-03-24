package com.mycompany.lab2hotelf;

import java.util.ArrayList;

public class Housekeeping extends Employee{
    private Hotel hotel;
    
    public Housekeeping(String name, String id, String location, String position, Shifts shift) {
        super(location, position, shift, name, id);
        this.hotel = new Hotel();
    }
    
    public void manageCleaning(Housekeeping housekeeper) {
        int roomQty = in.readAndValidateInt("¿En cuántas habitaciones desea registrar la limpieza?: ");
        for(int i = 0; i < roomQty; i++){
            String roomNo = in.readString("Ingresa el número de habitación que deseas registrar como limpia: ");
            housekeeper.cleanRoom(roomNo);
        }
    }
    
    public void cleanRoom(String roomNo){
        boolean foundRoom = false;
        ArrayList<Room> roomList = hotel.getRoomsList();
        for(int i = 0; i < roomList.size(); i++){
            if (roomList.get(i).getRoomNo().equals(roomNo)){
                roomList.get(i).setClean(true);
                foundRoom = true;
                break;
            }
        }
    }
}
