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
public class Team extends Guest{
    private String position;
    private String number;
    Reading in = new Reading();
    ArrayList<Team> equipo;


    public Team(String name, String id,String position, String number, String phoneNo, String Address, String room) {
        super(phoneNo, Address, room, name, id);
        this.position = position;
        this.number = number;
    }

    public void createTeam(){
        equipo = new ArrayList<Team>();
        int cantPlayers = in.leeryValidarInt("Ingresa la cantidad de jugadores que hay en tu equipo");
        for (int i = 0; i<cantPlayers; i++){
            Team player;
            String name = in.leerString("Nombre Jugador "+ (i+1));
            String id = in.leerString("Id");
            String pos = in.leerString("Posicion en la cancha");
            String num = in.leerString("Número de camiseta");
            String phoneNo = in.leerString("Número de telefono");
            String address = in.leerString("Direccion");
            String room = "";
            player = new Team(name,id,pos,num,phoneNo,address,room);
            equipo.add(player);
        }
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
