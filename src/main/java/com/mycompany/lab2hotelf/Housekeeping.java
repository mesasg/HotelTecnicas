package com.mycompany.lab2hotelf;

import java.util.ArrayList;

public class Housekeeping extends Employee{
    
    public Housekeeping(String location, String position, String shift, String name, String id) {
        super(location, position, shift, name, id);
    }

    public void cleanRoom(String roomNo, Hotel hotel){
        ArrayList<Room> roomList = hotel.getRoomsList();
            for(int i = 0; i < roomList.size(); i++){
                if (roomList.get(i).getRoomNo().equals(roomNo)){
                    roomList.get(i).setClean(true);
                    break;
                }
            }
    }
}
