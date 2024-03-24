package com.mycompany.lab2hotelf;

public class Receptionist extends Employee {
    private String phoneNo;
    Hotel hotel = new Hotel();
    Guest guest;
    Team player;

    public Receptionist(String name, String id,String phoneNo, String location, String position, Shifts shift ) {
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
        int guestType = in.readIntRange("Selecciona el tipo de huesped que deseas registrar\n1-Huesped normal\n2-Equipo de futbol",
                1, 2, "Opcion invalida");
        
        if (guestType == 1){
            int cantGuests = in.readIntRange("¿Cuantas personas se hospedaran?",1,4,
                "Opcion invalida\nSi son más de 4 personas, deben registrarse en grupos de 1, 2, 3 o 4; de acuerdo con la capacidad de nuestras habitaciones");
            Room room = new Room();
            switch (cantGuests){
                case 1 -> room = hotel.assignRoom(1);
                case 2 -> room = hotel.assignRoom(2);
                case 3 -> room = hotel.assignRoom(4);
                case 4 -> room = hotel.assignRoom(4);
            }
            for (int i = 0; i<cantGuests; i++){
                System.out.println("Húesped "+ (int)(i+1));
                registerGuest(room);
            }
        }
        
        else {
            int cantPlayers = in.readIntRange("¿Cuantas personas se hospedaran?",1,4,
                "Opcion invalida\nSi son más de 4 personas, deben registrarse en grupos de 1, 2, 3 o 4; de acuerdo con la capacidad de nuestras habitaciones");
            Room room = new Room();
            switch (cantPlayers){
                case 1 -> room = hotel.assignRoom(1);
                case 2 -> room = hotel.assignRoom(2);
                case 3 -> room = hotel.assignRoom(4);
                case 4 -> room = hotel.assignRoom(4);
            }
            for (int i = 0; i<cantPlayers; i++){
                System.out.println("Jugador "+ (int)(i+1));
                registerTeam(room);
            }
        }
    }
    
    public void registerGuest(Room room){
        String name = in.readString("Nombre: ");
        String id = in.readString("Id: ");
        String phone = in.readString("Número de telefono: ");
        String address = in.readString("Dirección: ");
        System.out.println("Habitación asignada: " + room.getRoomNo());
        guest = new Guest(name,id,phone,address,room);
        
    }
    public void registerTeam(Room room){
        String name = in.readString("Nombre Jugador ");
        String id = in.readString("Id");
        String pos = in.readString("Posicion en la cancha");
        String num = in.readString("Número de camiseta");
        String phone = in.readString("Número de telefono");
        String address = in.readString("Direccion");
        System.out.println("Habitación asignada: " + room.getRoomNo());
        player = new Team(name,id,pos,num,phone,address,room);
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
