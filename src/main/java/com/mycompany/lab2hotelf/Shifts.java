package com.mycompany.lab2hotelf;

import java.util.ArrayList;

public class Shifts {
    private Reading in = new Reading();
    private ArrayList<String> availableCustomShifts;
    private ArrayList<String> availableShifts;
    private ArrayList<Employee> assignedShifts;
    
    public void defineCustomShifts(){
        availableCustomShifts = new ArrayList<>();
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
            availableCustomShifts.add(dia + " 0-8");
            availableCustomShifts.add(dia + " 8-16");
            availableCustomShifts.add(dia + " 16-0");
        }
    }
    
     public void defineShifts(){
        availableShifts = new ArrayList<>();
        availableShifts.add("Mañana (Lunes-Domingo 0-8)");
        availableShifts.add("Tarde (Lunes-Domingo 8-16)");
        availableShifts.add("Noche (Lunes-Domingo 16-0)");
        
    }
    public String consultCustomShifts(){
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
                System.out.println(cont+" - "+availableCustomShifts.get(j));
                cont ++;
            }
            int seleccion = in.readIntRange("",0,2,"Opcion invalida");
            turno += availableCustomShifts.get(i+seleccion) + ", ";
            
        }
        return turno;
    }
    public void consultShifts(){
        for (int op = 0; op<availableShifts.size();op++){
                System.out.println((op+1) + " - " + availableShifts.get(op));
            }
        System.out.println("4- Personalizar turnos");
    }
    
    public void assignShifts(int cantidad){
        defineCustomShifts();
        defineShifts();
        assignedShifts = new ArrayList<>();
        Employee employee;
        int a=0;
        do{
            String name = in.readString("Nombre del trabajador");
            String id = in.readString("ID del trabajador ");
            String location = in.readString("Ubicación trabajador");
            
            int cargoNum = in.readIntRange("Cargo:\n1-Chef\n2-Recepcionista\n3-Limpieza",1,3,"Opción invalida");
            String position = "";
            switch (cargoNum){
                case 1 -> position = "Chef";
                case 2 -> position = "Recepcionista";
                case 3 -> position = "Limpieza";
            }
            
            System.out.println("Turnos disponibles");
            consultShifts();   
            int K = in.readIntRange("Selecciona el turno que deseas asignarle a "+name,
                    1, 4, "Opcion invalida");
            String shift = "";
            switch (K){
                case 1 -> shift = availableShifts.get(K-1);
                case 2 -> shift = availableShifts.get(K-1);
                case 3 -> shift = availableShifts.get(K-1);
                case 4 -> shift = consultCustomShifts();
            }
            employee = new Employee(name,id,location,position,shift);
            assignedShifts.add(employee);
            a++;
        }while(a<cantidad);
        int mostrarTurnos = in.readIntRange("¿Desea ver los turnos que acaba de asignar?\n1-Si\n2-No",
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shifts{");
        sb.append("in=").append(in);
        sb.append(", availableShifts=").append(availableCustomShifts);
        sb.append(", assignedShifts=").append(assignedShifts);
        sb.append('}');
        return sb.toString();
    }

    public ArrayList<String> getAvailableShifts() {
        return availableShifts;
    }

    public void setAvailableShifts(ArrayList<String> availableShifts) {
        this.availableShifts = availableShifts;
    }

    public ArrayList<String> getAvailableCustomShifts() {
        return availableCustomShifts;
    }

    public void setAvailableCustomShifts(ArrayList<String> availableCustomShifts) {
        this.availableCustomShifts = availableCustomShifts;
    }

    public ArrayList<Employee> getAssignedShifts() {
        return assignedShifts;
    }

    public void setAssignedShifts(ArrayList<Employee> assignedShifts) {
        this.assignedShifts = assignedShifts;
    }
}
