package com.mycompany.lab2hotelf;

import java.util.Scanner;

public class Reading {
    
    Scanner sc = new Scanner(System.in);
    
   //Int values readings
    public int readInt(String message){
        System.out.println(message);
        int dato = sc.nextInt();
        return dato;
    }

    public int readIntRange(String message, int min, int max, String errorMessage){
        int dato;
        do {
            System.out.println(message);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("Debe ser número entero positivo");
            }
            dato = sc.nextInt();
            if(dato < 0){
                System.out.println("El número debe ser positivo");
                System.out.println(errorMessage);
            }
            if (min>dato || dato>max){
                System.out.println(errorMessage);
            }
        }while (dato<0 || min>dato || dato>max);
        return dato;
    }
    
    public int readAndValidateInt(String message) {
        int dato;
        do {
            System.out.print(message);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("Debe ser número entero positivo");
            }
            dato = sc.nextInt();
            if(dato <= 0){
                System.out.println("El número debe ser positivo");
            }
        } while (dato <= 0);
        return dato;
    }
    
    //Float values readings
    public Float readFloat(String message){
        System.out.println(message);
        Float dato = sc.nextFloat();
        return dato;
    }
    
    public Float readFloatRange(String message, Float min, Float max){
        Float dato;
        do{
            System.out.println(message);
            dato = sc.nextFloat();
            if (dato<min || dato>max){
                System.out.println("Ingresa un número valido, dentro del rango " + min + " - " + max);
            }
        }while(dato<min || dato>max);
        return dato;
    }
    
    //Double values readings
    public Double readDouble(String message){
        System.out.println(message);
        Double dato = sc.nextDouble();
        return dato;
    }
  
    public Double readDoubleRange(String message, Double min, Double max){
        Double dato;
        do{
            System.out.println(message);
            dato = sc.nextDouble();
            if (dato<min || dato>max){
                System.out.println("Ingresa un número valido, dentro del rango " + min + " - " + max);
            }
        }while(dato<min || dato>max);
        return dato;
    }
    
    //String values readings
    public String readString(String message){
        System.out.println(message);
        String dato = sc.next();
        dato += sc.nextLine(); //garantizar lectura de la palabra completa
        return dato;
    }
}