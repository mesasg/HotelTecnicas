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
public class Receptionist extends Employee {
    private String phoneNo;
    Hotel hotel = new Hotel();
    Guest guest;
    Player player;

    public Receptionist(String name, String id,String phoneNo, String location, String position, String shift ) {
        super(location, position, shift, name, id);
        this.phoneNo = phoneNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    public void checkRoomAvailability(){
        System.out.println("Hay un total de "+hotel.countAvailableRooms()+" habitaciones disponibles.");
    }
    
    public void bookRoom(){
        boolean registerOther = false;
        do {
            int guestType = in.readIntRange("Selecciona el tipo de huesped que deseas registrar\n1-Huesped normal\n2-Equipo de futbol",
                1, 2, "Opcion invalida");
        
        if (guestType == 1){
            int cantGuests = in.readIntRange("¿Cuantas personas se hospedaran?",1,4,
                "Opcion invalida\nSi son más de 4 personas, deben registrarse en grupos de 1, 2, 3 o 4; de acuerdo con la capacidad de nuestras habitaciones");
            String room = "";
            switch (cantGuests){
                case 1 -> room = hotel.assignRoom(1);
                case 2 -> room = hotel.assignRoom(2);
                case 3 -> room = hotel.assignRoom(4);
                case 4 -> room = hotel.assignRoom(4);
            }
            if("".equals(room)){
                System.out.println("No hay habitaciones disponibles");
            }
            else{
                for (int i = 0; i<cantGuests; i++){
                    System.out.println("Húesped "+ (int)(i+1));
                    registerGuest(room);
                }
            }
        }
        
        else {
            int cantPlayers = in.readIntRange("¿Cuantas personas se hospedaran?",1,4,
                "Opcion invalida\nSi son más de 4 personas, deben registrarse en grupos de 1, 2, 3 o 4; de acuerdo con la capacidad de nuestras habitaciones");
             String room = "";
            switch (cantPlayers){
                case 1 -> room = hotel.assignRoom(1);
                case 2 -> room = hotel.assignRoom(2);
                case 3 -> room = hotel.assignRoom(4);
                case 4 -> room = hotel.assignRoom(4);
            }
            if("".equals(room)){
                System.out.println("No hay habitaciones disponibles");
            }
            else{
                for (int i = 0; i<cantPlayers; i++){
                System.out.println("Jugador "+ (int)(i+1));
                registerTeam(room);
                }  
            }
        }
        int opcion = in.readIntRange("Si desea registrar otro huesped ingrese 1, de lo contrario, si desea finalizar esta transacción ingrese 2",1,2,
                "Opción invalida");
        if (opcion == 1){
            registerOther = true;
        }
        else{
            registerOther = false;
        }
        }while(registerOther == true);
        
    }
    
    public void registerGuest(String roomNo){
        String name = in.readString("Nombre: ");
        String id = in.readString("Id: ");
        String phone = in.readString("Número de telefono: ");
        String address = in.readString("Dirección: ");
        System.out.println("Habitación asignada: " + roomNo);
        guest = new Guest(name,id,phone,address,roomNo);
        
    }
    public void registerTeam(String roomNo){
        String name = in.readString("Nombre Jugador ");
        String id = in.readString("Id");
        String pos = in.readString("Posicion en la cancha");
        String num = in.readString("Número de camiseta");
        String phone = in.readString("Número de telefono");
        String address = in.readString("Direccion");
        System.out.println("Habitación asignada: " + roomNo);
        player = new Player(name,id,pos,num,phone,address,roomNo);
        player.createTeam(player);
    }
    
    public void generateBill(){
        
    }
    public void acceptCustomerFeedback(){
        
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Receptionist{");
        sb.append("phoneNo=").append(phoneNo);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
