/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objetostrabajocasa;

/**
 *
 * @author usuario
 */
public class ObjetosTrabajoCasa {

    public static void main(String[] args) {
        Alumno Alum1 = new Alumno ();
        Alum1.Nombre= "David Gabriel";
        Alum1.Apellido= "Barreto García";
        Alum1.edad = 18;
        Alum1.peso = 65.3;
        Alum1.inteligencia = 50;
        Alum1.Comer();
        Alum1.mostrasDatos();
    }
}
