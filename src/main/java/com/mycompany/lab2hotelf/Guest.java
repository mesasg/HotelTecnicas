package com.mycompany.lab2hotelf;

public class Guest extends Person {
    private String phoneNo;
    private String address;
    private Room room;
    
    //Constructors
    public Guest(String name, String id) {
        super(name, id);
    }
    
    public Guest(String name, String id,String phoneNo, String address, Room room) {
        super(name, id);
        this.phoneNo = phoneNo;
        this.address = address;
        this.room = room;
    }
    
    //Methods
    public void checkIn(){
        System.out.println("Bienvenido a tu habitación"
                + "\n¿Deseas solicitar servicio de alimentación?");
        int reqFood = in.readIntRange("1: Sí, 2: No", 1, 2, "Ingresó un valor fuera del rango");
        if (reqFood == 1) {
            this.requestFood();
        }
    }
    
    public void requestFood(){
        int chefOption, foodOption;
        System.out.println("¿Desea su comida preparada por un chef francés o uno regular?");
        chefOption = in.readIntRange("Ingrese: "
                    + "\n1: Si desea un chef francés (Valor del 15% adicional)"
                    + "\n2: Si desea un chef regular"
                    ,1,2,"Ingresó un valor fuera del rango");
        
        foodOption = in.readIntRange("Ingrese: "
                                    + "\n1: Si desea un menú premium ($30000)"
                                    + "\n2: Si desea un menú esencial ($20000)"
                                    + "\n3: Si desea un menú básico ($15000)"
                                    ,1,3,"Ingresó un valor fuera del rango");
        
        if (chefOption == 1){
            switch (foodOption){
                case 1: 
                    hotel.getFoodList().get(0).setChefNationality("French");
                    this.room.setPricePerFood(hotel.getFoodList().get(0).getPrice()*1.15);
                    break;
                case 2: 
                    hotel.getFoodList().get(1).setChefNationality("French");
                    this.room.setPricePerFood(hotel.getFoodList().get(1).getPrice()*1.15);
                    break;
                case 3: 
                    hotel.getFoodList().get(2).setChefNationality("French");
                    this.room.setPricePerFood(hotel.getFoodList().get(2).getPrice()*1.15);
                    break;
            }
        }else if (chefOption ==2){
            switch (foodOption){
                case 1: 
                    hotel.getFoodList().get(0).setChefNationality("Non-french");
                    this.room.setPricePerFood(hotel.getFoodList().get(0).getPrice());
                    break;
                case 2: 
                    hotel.getFoodList().get(1).setChefNationality("Non-french");
                    this.room.setPricePerFood(hotel.getFoodList().get(1).getPrice());
                    break;
                case 3:
                    hotel.getFoodList().get(2).setChefNationality("Non-french");
                    this.room.setPricePerFood(hotel.getFoodList().get(2).getPrice());
                    break;
            }
        }
    }
    
    //Getter and setters
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Huésped: \n Nombre:").append(super.getName());
        sb.append("\nNúmero:").append(phoneNo);
        sb.append("\nAddress: ").append(address);
        sb.append("\nHabitación: ").append(room.getRoomNo());
        sb.append("\n");
        return sb.toString();
    }
}
