package com.mycompany.lab2hotelf;

import static com.mycompany.lab2hotelf.Lab2HotelF.hotel;
import java.util.ArrayList;

public class Housekeeping extends Employee{
    
    public Housekeeping(String name, String id, String location, String position, String shift) {
        super(location, position, shift, name, id);
    }
    
    public void manageCleaning(Housekeeping housekeeper) {
        int roomQty = in.readAndValidateInt("¿En cuántas habitaciones desea registrar la limpieza?: ");
        for(int i = 0; i < roomQty; i++){
            String roomNo = in.readString("Ingresa el número de habitación que deseas registrar como limpia: ");
            housekeeper.cleanRoom(roomNo);
        }
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
