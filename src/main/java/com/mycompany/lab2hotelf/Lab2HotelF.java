package com.mycompany.lab2hotelf;

public class Lab2HotelF {
    static Manager manager;
    static Receptionist receptionist;
    static Housekeeping housekeeper;
    static Hotel hotel = new Hotel();
    static Reading in = new Reading();
    static int volver;
    public static void main(String[] args) {
        
        do{
            System.out.println("BIENVENIDO A HOTEL FOLLOWERS \n"
                + "Si desea acceder como:\n"
                + "Huésped:        Ingrese 1 \n"
                + "Recepcionista:  Ingrese 2 \n"
                + "Administrador:  Ingrese 3 \n"
                + "Mucama:         Ingrese 4");
            int nivelAcceso = in.readIntRange(" ",1,4,"Opción invalida");
            switch(nivelAcceso){
                case 1 -> logInGuest();
                case 2 -> logInReceptionist();
                case 3 -> logInManager();
                case 4 -> logInHousekeeping();
            }
            System.out.println();
            volver = in.readIntRange("¿Desea hacer otra transacción? \nEn caso afirmativo ingrese 1, de lo contrario ingrese 2",
                    1,2,"Opción invalida");
        }while(volver == 1);
        
    }
    
    public static void logInManager(){
        String position = "Manager";
        String shift = "Current";
        String name = in.readString("Ingresa tu nombre: ");
        String id  = in.readString("Ingresa tu identificación");
        String phoneNo = in.readString("Ingresa tu número de telefono");
        String location = in.readString("Ingresa tu ubicación");
        manager = new Manager(name,id,phoneNo,location,position,shift);
        manager.manageStaff();
    }
    
    public static void logInReceptionist(){
        String position = "Receptionist";
        String shift = "Current";
        String name = in.readString("Ingresa tu nombre: ");
        String id  = in.readString("Ingresa tu identificación");
        String phoneNo = in.readString("Ingresa tu número de telefono");
        String location = in.readString("Ingresa tu ubicación");
        receptionist = new Receptionist(name,id,phoneNo,location,position,shift);
        receptionist.bookRoom();
    }
    
    public static void logInGuest(){
        
    }
    
    public static void logInHousekeeping(){
        String position = "Housekeeper";
        String shift = "Current";
        String name = in.readString("Ingresa tu nombre: ");
        String id  = in.readString("Ingresa tu identificación");
        String location = in.readString("Ingresa tu ubicación");
        housekeeper = new Housekeeping(name,id,location,position,shift);
        housekeeper.manageCleaning(housekeeper);
    }
}
