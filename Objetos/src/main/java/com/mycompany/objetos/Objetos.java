/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objetos;

/**
 *
 * @author usuario
 */
public class Objetos {

    public static void main(String[] args) {
        System.out.println("Creo el cochazo de Rut");
        //Creo una instancia de coche
        Coche cochazoRut = new Coche();
        //Cambio sus atributus
        cochazoRut.marca = "Ferrari";
        cochazoRut.color = "negro";
        cochazoRut.kms = 0;
        //Ejecuto acciones 
        cochazoRut.arrancar();
        System.out.println("La velocidad a la que va es: " + cochazoRut.velocidad);
        System.out.println("Velocidad nueva " + cochazoRut.velocidad);
        cochazoRut.estrellarse();
        
        Coche cocheDavid = new Coche();
        cocheDavid.color = "Negro";
        cocheDavid.marca = "Mecerdes AMG 45";
        cocheDavid.velocidad = 0;
        
       cocheDavid.mostrarCoche();
       cocheDavid.pintar("Amarillo");
       cocheDavid.pintar("Azul");
       cocheDavid.mostrarCoche();
        
        
    }
}
