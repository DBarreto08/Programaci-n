/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cinefunciones;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CineFunciones {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int capacidad = 0;
        do {
            System.out.println("Cuntos sois? ");
            int personas = keyboard.nextInt();
            double precioEntrada = 8;
        System.out.println("Dime tu nombre ");
        String nombre = keyboard.nextLine();
        System.out.println("Dime tu edad ");
        int edad = keyboard.nextInt();
        precioEntrada = descuentos (precioEntrada, edad);
        System.out.println("El precio de tu entrada es: " + precioEntrada);
        capacidad = capacidad + personas;
        } while ( capacidad < 60 );
        System.out.println("Ya no quedan entradas, lo siento");
        }
  
    public static double descuentos(double Precio, int edad){
        if (edad < 18){
            Precio = Precio * 0.95;
        }if(edad >= 18 && edad <=60){
            Precio = Precio * 0.93;
        }else{
          Precio = Precio * 0.90;
        }
        return Precio;
    }
}
