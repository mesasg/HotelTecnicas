/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2hotelf;

/**
 *
 * @author saram
 */
import java.util.Scanner;

public class Reading {
    
     Scanner sc = new Scanner(System.in);
     
    public int leerInt(String mensaje){
        System.out.println(mensaje);
        int dato = sc.nextInt();
        return dato;
    }
    public String leerString(String mensaje){
        System.out.println(mensaje);
        String dato = sc.next();
        return dato;
    }
    public Float leerFloat(String mensaje){
        System.out.println(mensaje);
        Float dato = sc.nextFloat();
        return dato;
    }
    
    public Float leerFloatRango(String mensaje, int min, int max){
        Float dato;
        do{
            System.out.println(mensaje);
            dato = sc.nextFloat();
            if (dato<min || dato>max){
                System.out.println("Ingresa un número valido, dentro del rango " + min + " - " + max);
            }
        }while(dato<min || dato>max);
        return dato;
    }
    
    public Double leerDouble(String mensaje){
        System.out.println(mensaje);
        Double dato = sc.nextDouble();
        return dato;
    }
    
    public Double leerDoubleRango(String mensaje, int min, int max){
        Double dato;
        do{
            System.out.println(mensaje);
            dato = sc.nextDouble();
            if (dato<min || dato>max){
                System.out.println("Ingresa un número valido, dentro del rango " + min + " - " + max);
            }
        }while(dato<min || dato>max);
        return dato;
    }

    public int leeryValidarInt(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje);
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
    
    public int leerIntRango(String mensaje, int min, int max, String mensajeError){
        int dato;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("Debe ser número entero positivo");
            }
            dato = sc.nextInt();
            if(dato < 0){
                System.out.println("El número debe ser positivo");
                System.out.println(mensajeError);
            }
            if (min>dato || dato>max){
                System.out.println(mensajeError);
            }
        }while (dato<0 || min>dato || dato>max);
        return dato;
    }
    
    
    
}
