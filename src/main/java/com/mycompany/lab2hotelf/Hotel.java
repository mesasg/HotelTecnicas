package com.mycompany.lab2hotelf;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomsList;

    //Constructors
    public Hotel() {
        this.roomsList = new ArrayList<>();
    }
    
    public Hotel(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
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
    
    public int availableRooms(){
        int numberOfRooms = roomsList.size();
        int numberOfAvailableRooms = 0;
        for(int i = 0; i < numberOfRooms; i++){
            if (roomsList.get(i).isAvailable()){
               numberOfAvailableRooms += 1; 
            }
        }
        return(numberOfAvailableRooms);
    }
    
    //Getters and setters
    public ArrayList<Room> getRoomsList() {
        return roomsList;
    }

    public void setRoomsList(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
    }
}
