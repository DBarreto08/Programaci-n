/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetostrabajocasa;

/**
 *
 * @author usuario
 */
public class Alumno {
    //Defino los atributos
    String Nombre;
    String Apellido;
    int edad;
    double peso;
    int inteligencia;
    
    public void Comer(){
      peso = peso + 1;  
    }
    public void correr (){
        peso = peso - 2;
    }
    public void jugarAlGTAVI(){
        inteligencia = inteligencia - 5;
    }
    public void estudiar(){
        inteligencia = inteligencia + 5;
    }
    public void mostrasDatos(){
        System.out.println("el peso de David es: " + peso + " KG");
    }
}

