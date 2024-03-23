/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2hotelf;

import java.util.ArrayList;

/**
 *
 * @author saram
 */
public class Rooms {
    private String number;
    private boolean avalaible;
    private ArrayList<Rooms> rooms;

    public Rooms(String number, boolean avalaible) {
        this.number = number;
        this.avalaible = avalaible;
    }

    public Rooms() {
    }
    
    public void defineRooms(){
        rooms = new ArrayList<>();
        Rooms room;
        String num;
        for(int i = 1; i<4;i++){
            for (int j = 00; j<11; j++){
                num = (String.valueOf(i)+ String.valueOf(j));
                room = new Rooms(num,true);
                rooms.add(room);
            }
        }
    }

    public ArrayList<Rooms> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Rooms> rooms) {
        this.rooms = rooms;
    }
    
}
