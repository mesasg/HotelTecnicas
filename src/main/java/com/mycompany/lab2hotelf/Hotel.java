package com.mycompany.lab2hotelf;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomsList;
    private ArrayList<Room> availableRooms;

    //Constructors
    public Hotel() {
        this.roomsList = new ArrayList<>();
        defineRooms();
    }
    
    public Hotel(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
    }
    
    public String assignRoom(int numGuest){
        getAvailableRooms();
        for (Room room : availableRooms){
            
            if(true == room.isAvailable() && (room.getCapacity() == numGuest)){
                room.setAvailable(false);
                return room.getRoomNo();
            }
        }
        return "";
    }
    
    //Methods
    public void defineRooms(){
        String roomNumber;
        String roomLocation;
        String roomType;
        int capacity;
        for(int i = 1; i<5;i++){
            for (int j = 1; j<6; j++){
                
                if (j == 1){
                    roomType = "Grande";
                    capacity = 4;
                }
                else if (j == 2){
                    roomType = "Mediana";
                    capacity = 2;
                }
                else{
                    roomType = "Pequeña";
                    capacity = 1;
                }
                roomNumber =(String.valueOf(i)+ "0"+ String.valueOf(j));
                roomLocation = "Piso "+ String.valueOf(i);
                Room room = new Room(roomNumber,roomLocation,roomType, capacity, true, true);
                roomsList.add(room);
            }
        }
    }
    
    public int countAvailableRooms(){
        int numberOfRooms = roomsList.size();
        int numberOfAvailableRooms = 0;
        for(int i = 0; i < numberOfRooms; i++){
            if (roomsList.get(i).isAvailable()){
               numberOfAvailableRooms += 1; 
            }
        }
        return(numberOfAvailableRooms);
    }
    
    public void getAvailableRooms(){
        availableRooms = new ArrayList<>();
        for (int i  = 0; i <roomsList.size() ;i++){
            if(true == roomsList.get(i).isAvailable()){
                availableRooms.add(roomsList.get(i));
            }
        }
        
    }
    //Getters and setters
    public ArrayList<Room> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
    }
}
