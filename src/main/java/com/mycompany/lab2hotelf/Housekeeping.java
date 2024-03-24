package com.mycompany.lab2hotelf;

import java.util.ArrayList;

public class Housekeeping extends Employee{
    private Hotel hotel;
    
    public Housekeeping(String name, String id, String location, String position, String shift) {
        super(location, position, shift, name, id);
        this.hotel = new Hotel();
    }
    
    public void manageCleaning(Housekeeping housekeeper) {
        hotel.defineRooms();
        int roomQty = in.readAndValidateInt("¿En cuántas habitaciones desea registrar la limpieza?: ");
        for(int i = 0; i < roomQty; i++){
            String roomNo = in.readString("Ingresa el número de habitación que deseas registrar como limpia: ");
            housekeeper.cleanRoom(roomNo);
        }
        System.out.println(hotel.getRoomsList());
    }
    
    public void cleanRoom(String roomNo){
        ArrayList<Room> roomList = hotel.getRoomsList();
            for(int i = 0; i < roomList.size(); i++){
                if (roomList.get(i).getRoomNo().equals(roomNo)){
                    roomList.get(i).setClean(true);
                    break;
                }
            }
    }
}
