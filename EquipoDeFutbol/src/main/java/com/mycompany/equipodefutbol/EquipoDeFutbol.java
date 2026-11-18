/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equipodefutbol;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuario
 */
public class EquipoDeFutbol {
enum puntaje{
    METERGOL(3) , ASISTENCIA(2) , REGATE(1), NADA(0);
    private final int valor;
    puntaje (int valor){
        this.valor = valor;
    }
}
    public static void main(String[] args) {
        equipo1();
        equipo2();
       
    }
    public static void equipo1(){
        String [] jugadoresBarca = {"Lamine", "Kunde", "Balde", "Fermín", "Pedri", "Gavi" , "Joan", "Raphinha", "Gabriel", "Dani", "Cubarsí"};
        int p1 = ThreadLocalRandom.current().nextInt(0, 11);
        
        int p2;
        do { p2 = ThreadLocalRandom.current().nextInt(0, 11); } 
        while (p2 == p1);

        int p3;
        do { p3 = ThreadLocalRandom.current().nextInt(0, 11); } 
        while (p3 == p1 || p3 == p2);

        int p4;
        do { p4 = ThreadLocalRandom.current().nextInt(0, 11); } 
        while (p4 == p1 || p4 == p2 || p4 == p3);

        int p5;
        do { p5 = ThreadLocalRandom.current().nextInt(0, 11); } 
        while (p5 == p1 || p5 == p2 || p5 == p3 || p5 == p4);
        System.out.println("Los 5 jugadores titulares del Barcelona son:");
        System.out.println("- " + jugadoresBarca[p1]);
        System.out.println("- " + jugadoresBarca[p2]);
        System.out.println("- " + jugadoresBarca[p3]);
        System.out.println("- " + jugadoresBarca[p4]);
        System.out.println("- " + jugadoresBarca[p5]);
    }
    
    public static void equipo2(){
        String[] jugadoresMadrid = {"Courtois", "Carvajal", "Militão", "Rüdiger", "Mendy", "Valverde", "Tchouaméni", "Camavinga", "Arda", "Vinícius", "Mbappé"};
        int p1 = ThreadLocalRandom.current().nextInt(0, 12);
        
        int p2;
        do { p2 = ThreadLocalRandom.current().nextInt(0, 12); } 
        while (p2 == p1);

        int p3;
        do { p3 = ThreadLocalRandom.current().nextInt(0, 12); } 
        while (p3 == p1 || p3 == p2);

        int p4;
        do { p4 = ThreadLocalRandom.current().nextInt(0, 12); } 
        while (p4 == p1 || p4 == p2 || p4 == p3);

        int p5;
        do { p5 = ThreadLocalRandom.current().nextInt(0, 12); } 
        while (p5 == p1 || p5 == p2 || p5 == p3 || p5 == p4);
        System.out.println("Los 5 jugadores titulares del Madrid son:");
        System.out.println("- " + jugadoresMadrid[p1]);
        System.out.println("- " + jugadoresMadrid[p2]);
        System.out.println("- " + jugadoresMadrid[p3]);
        System.out.println("- " + jugadoresMadrid[p4]);
        System.out.println("- " + jugadoresMadrid[p5]);
    }
}
