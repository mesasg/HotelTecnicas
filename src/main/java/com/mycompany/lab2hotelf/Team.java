/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2hotelf;

/**
 *
 * @author saram
 */
public class Team extends Guest{
    private String position;
    private String number;
    Reading in = new Reading();

    public Team(String name, String id,String position, String number, String phoneNo, String Address, String room) {
        super(phoneNo, Address, room, name, id);
        this.position = position;
        this.number = number;
    }

    public void createTeam(){
        int cantPlayers = in.leeryValidarInt("Ingresa la cantidad de jugadores que hay en tu equipo");
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
