/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usandofunciones;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuario
 */
public class Usandofunciones {

    public static void main(String[] args) {
        String pok1 = "Pikachu";
        String pok2 = "Gegar";
        welcome(pok1);
        welcome(pok2);
        int vidaPok1 = generaNumero();
        int vidaPok2 = generaNumero();
        int ataquePok1 = generaNumero();
        int ataquePok2 = generaNumero();
        int defensaPok1 = generaNumero();
        int defensaPok2 = generaNumero();
        muestrapersonaje(pok1,ataquePok1,ataquePok1,defensaPok1);
        muestrapersonaje(pok2,ataquePok2,ataquePok2,defensaPok2);
        System.out.println(pok1 + " tiene " + vidaPok1 + " de vida.");
        System.out.println(pok2 + " tiene " + vidaPok2 + " de vida ");
        if (esMayor(vidaPok1, vidaPok2)){
            System.out.println(pok1 + " es mayor que " + pok2);
        }else{
            System.out.println(pok2 + " es mayor que " + pok1);
        }
        vidaPok1 = combate(pok1, pok2, ataquePok2, vidaPok1, defensaPok1);
        vidaPok2 = combate(pok1, pok2, ataquePok1, vidaPok2, defensaPok2);
        
    }
    public static void welcome (String namePok){
        System.out.println("Welcome to the jungle, " + namePok);
    }
    public static int generaNumero(){
        int number = ThreadLocalRandom.current().nextInt(1,101);
        return number;
    }
    //Esra funcion me va a decir si la vida1 es mayor a vida2
    public static boolean esMayor(int unaVida, int otraVida){
       if (unaVida > otraVida){
           return true;
       }else {
           return false;
       }
       //Tambien se podria hacer asi: 
       // return (unaVida > otraVida)
    }
    public static void muestrapersonaje (String nombre, int ataque, int vida, int defensa){
        System.out.println(nombre + ":" );
        System.out.println("Vida" + vida);
        System.out.println("ataque " + ataque);
        System.out.println("defensa" + defensa);
    }
    public static int combate(String nomPok1, String nomPok2, int ataque, int vida, int defensa){
        System.out.println(nomPok1 + " se enfrenta a " + nomPok2);
        vida = vida - (defensa - ataque);
        System.out.println(nomPok1 + " tiene " + vida );
        return vida;
    }
    
}
