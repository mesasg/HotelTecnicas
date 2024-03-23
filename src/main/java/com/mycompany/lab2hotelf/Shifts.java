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
public class Shifts {
    private Reading in = new Reading();
    private ArrayList<String> avaliableCostumShifts;
    private ArrayList<String> avaliableShifts;
    private ArrayList<Employee> assignedShifts;
    
    public void defineCostumShifts(){
        avaliableCostumShifts = new ArrayList<>();
        String dia = "";
        for (int d = 1; d<=7;d++){
            switch (d){
                case 1 -> dia = "Lunes";
                case 2 -> dia = "Martes";
                case 3 -> dia = "Miercoles";
                case 4 -> dia = "Jueves";
                case 5 -> dia = "Viernes";
                case 6 -> dia = "Sabado";
                case 7 -> dia = "Domingo";
            }
            avaliableCostumShifts.add(dia + " 0-8");
            avaliableCostumShifts.add(dia + " 8-16");
            avaliableCostumShifts.add(dia + " 16-0");
        }
    }
    
     public void defineShifts(){
        avaliableShifts = new ArrayList<>();
        avaliableShifts.add("Mañana (Lunes-Domingo 0-8)");
        avaliableShifts.add("Tarde (Lunes-Domingo 8-16)");
        avaliableShifts.add("Noche (Lunes-Domingo 16-0)");
        
    }
    public String consultCostumShifts(){
        String turno = "";
        for (int i =0; i<19; i+=3){
            switch (i){
                case 0 -> System.out.println("Selecciona el turno del Lunes");
                case 3 -> System.out.println("Selecciona el turno del Martes");
                case 6 -> System.out.println("Selecciona el turno del Miercoles");
                case 9 -> System.out.println("Selecciona el turno del Jueves");
                case 12 -> System.out.println("Selecciona el turno del Viernes");
                case 15 -> System.out.println("Selecciona el turno del Sabado");
                case 18 -> System.out.println("Selecciona el turno del Domingo");
            }
            int cont = 0;
            for (int j = i; j<i+3; j++){
                System.out.println(cont+" - "+avaliableCostumShifts.get(j));
                cont ++;
            }
            int seleccion = in.leerIntRango("",0,2,"Opcion invalida");
            turno += avaliableCostumShifts.get(i+seleccion) + ", ";
            
        }
        return turno;
    }
    public void consultShifts(){
        for (int op = 0; op<avaliableShifts.size();op++){
                System.out.println((op+1) + " - " + avaliableShifts.get(op));
            }
        System.out.println("4- Personalizar turnos");
    }
    
    public void assignShifts(int cantidad){
        defineCostumShifts();
        defineShifts();
        assignedShifts = new ArrayList<>();
        Employee employee;
        int a=0;
        do{
            String name = in.leerString("Nombre del trabajador");
            String id = in.leerString("ID del trabajador ");
            String location = in.leerString("Ubicación trabajador");
            
            int cargoNum = in.leerIntRango("Cargo:\n1-Chef\n2-Recepcionista\n3-Limpieza",1,3,"Opción invalida");
            String position = "";
            switch (cargoNum){
                case 1 -> position = "Chef";
                case 2 -> position = "Recepcionista";
                case 3 -> position = "Limpieza";
            }
            
            System.out.println("Turnos disponibles");
            consultShifts();   
            int K = in.leerIntRango("Selecciona el turno que deseas asignarle a "+name,
                    1, 4, "Opcion invalida");
            String shift = "";
            switch (K){
                case 1 -> shift = avaliableShifts.get(K-1);
                case 2 -> shift = avaliableShifts.get(K-1);
                case 3 -> shift = avaliableShifts.get(K-1);
                case 4 -> shift = consultCostumShifts();
            }
            employee = new Employee(name,id,location,position,shift);
            assignedShifts.add(employee);
            a++;
        }while(a<cantidad);
        int mostrarTurnos = in.leerIntRango("¿Desea ver los turnos que acaba de asignar?\n1-Si\n2-No",
                1, 2, "Opcion Invalida");
        if (mostrarTurnos == 1){
            showAssignedShifts();
        }
    }
    
    public void showAssignedShifts(){
        for (Employee turno : assignedShifts){
            System.out.println(turno);
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shifts{");
        sb.append("in=").append(in);
        sb.append(", avaliableShifts=").append(avaliableCostumShifts);
        sb.append(", assignedShifts=").append(assignedShifts);
        sb.append('}');
        return sb.toString();
    }

    public Reading getIn() {
        return in;
    }

    public void setIn(Reading in) {
        this.in = in;
    }

    public ArrayList<String> getAvaliableCostumShifts() {
        return avaliableCostumShifts;
    }

    public void setAvaliableCostumShifts(ArrayList<String> avaliableCostumShifts) {
        this.avaliableCostumShifts = avaliableCostumShifts;
    }

    public ArrayList<Employee> getAssignedShifts() {
        return assignedShifts;
    }

    public void setAssignedShifts(ArrayList<Employee> assignedShifts) {
        this.assignedShifts = assignedShifts;
    }

    
    
}
