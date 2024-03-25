package com.mycompany.lab2hotelf;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomsList;
    private ArrayList<Room> availableRooms;
    private ArrayList<Chef> chefList;
    private ArrayList<Food> foodList;

    //Constructors
    public Hotel() {
        this.roomsList = new ArrayList<>();
        this.chefList = new ArrayList<>();
        this.foodList = new ArrayList<>();
        defineRooms();
        defineFoodList();
        defineChefList();  
    }
    
    public Hotel(ArrayList<Room> roomsList) {
        this.roomsList = roomsList;
    }
    
    //Methods
    public Room assignRoom(int numGuest){
        getAvailableRooms();
        for (Room room : availableRooms){
            if(true == room.isAvailable() && room.getCapacity() == numGuest){
                room.setAvailable(false);
                return room;
            }
        }
        return null;
    }
    
    public void defineRooms(){
        String roomNumber;
        String roomLocation;
        String roomType;
        double pricePerFood = 0;
        double pricePerHour = 0;
        int capacity;
        for(int i = 1; i<5; i++){
            for (int j = 1; j<6; j++){
                
                if (j == 1){
                    roomType = "Grande";
                    capacity = 4;
                    pricePerHour = 5000;
                }
                else if (j == 2){
                    roomType = "Mediana";
                    capacity = 2;
                    pricePerHour = 4000;
                }
                else{
                    roomType = "Pequeña";
                    capacity = 1;
                    pricePerHour = 3000;
                }
                roomNumber =(String.valueOf(i)+ "0"+ String.valueOf(j));
                roomLocation = "Piso "+ String.valueOf(i);
                Room room = new Room(roomNumber,
                                     roomLocation,
                                     roomType,
                                     capacity,
                                     pricePerFood,
                                     pricePerHour,
                                     true,
                                     true,
                                     null);
                roomsList.add(room);
            }
        }
    }
    
    public void defineChefList(){
        Chef frenchChef = new Chef("French", "Kitchen", "Chef", "Current", "Louis", "100292221");
        Chef regularChef = new Chef("Non-french", "Kitchen", "Chef", "Current", "Michael", "912882222");
        chefList.add(frenchChef);
        chefList.add(regularChef);
    }
    
    public void defineFoodList(){
        Food premiumMenu = new Food("Menú premium", 30000, "Default");
        Food regularMenu = new Food("Menú esencial", 20000, "Default");
        Food basicMenu = new Food("Menú básico", 15000, "Default");
        foodList.add(premiumMenu);
        foodList.add(regularMenu);
        foodList.add(basicMenu);
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

    public ArrayList<Chef> getChefList() {
        return chefList;
    }

    public void setChefList(ArrayList<Chef> chefList) {
        this.chefList = chefList;
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }
}
