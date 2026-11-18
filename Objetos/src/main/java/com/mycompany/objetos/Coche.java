package com.mycompany.objetos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Coche {
    //Definimos los atributos
    String marca;
    String color;
    float kms;
    int velocidad;
    
    //Métodos 
    public void arrancar(){
        System.out.println("Arrancando....");
        velocidad = 1;
    }
    public void acelerar(){
        System.out.println("Acelerand...");
        velocidad = velocidad + 10;
    }
    public void pintar (String unColor){
        System.out.println("Pintando....");
        color = unColor;
    }
    public void estrellarse(){
        System.out.println("CATAPUM CHIMPUN, RUT....");
        velocidad = 0;
        
    }
    public void mostrarCoche(){
        System.out.printf("Coche: %s %s con %.2f kms. Va a %d kms/h" , marca, color, velocidad);
    }
}
