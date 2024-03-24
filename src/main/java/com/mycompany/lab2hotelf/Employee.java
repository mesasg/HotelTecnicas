package com.mycompany.lab2hotelf;

public class Employee extends Person {
    private String location;
    private String position;
    private String shift;

    public Employee(String location, String position, String shift, String name, String id) {
        super(name, id);
        this.location = location;
        this.position = position;
        this.shift = shift;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append(", Ubicacion=").append(location);
        sb.append(", Cargo=").append(position);
        sb.append(", Turno=").append(shift);
        sb.append('}');
        return sb.toString();
    }
    
    
}