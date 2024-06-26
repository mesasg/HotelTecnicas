package com.mycompany.lab2hotelf;

import java.util.ArrayList;

public class Player extends Guest{
    private String position;
    private String number;
    ArrayList<Player> equipo = new ArrayList<>();

    public Player(String name, String id,String position, String number, String phoneNo, String address, Room room) {
        super(name, id, phoneNo, address, room);
        this.position = position;
        this.number = number;
    }

    public void createTeam(Player player){
        equipo.add(player);
        
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public ArrayList<Player> getTeam(){
        return equipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player{");
        sb.append("position=").append(position);
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
    
    
}
