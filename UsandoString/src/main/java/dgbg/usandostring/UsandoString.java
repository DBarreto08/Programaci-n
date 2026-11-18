/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgbg.usandostring;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class UsandoString {

    public static void main(String[] args) {
//        personaje();
personajes3();
    }
    public static void personaje(){
        String personaje = "Luna:Arquera:Italia";
        String[] partes = personaje.split(":", -1);
        for (String parte : partes) {
            System.out.println(parte);
        }
   }
    public static void personajes2(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor introduzca el pesonaje (con : ");
        String personaje = keyboard.nextLine();
        System.out.println(personaje);
        String [] partes = personaje.split(":", -1);
        while (partes.length != 3){
            System.out.println("Oye, te has equivocado. Vuelve a introducir " +  "personaje");
            personaje = keyboard.nextLine();
            partes = personaje.split(":", -1);
        }
        System.out.println(Arrays.toString(partes));
    }
    public static void personajes3(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Por favor introduzca el nombre de su personaje 1, poniendo nombre:oficio:pais:fuerza");
        String personaje1 = keyboard.nextLine();
        String[] partes1 = personaje1.split(":", -1);
        while (partes1.length != 4){
            System.out.println("Oye, te has equivocado. Vuelve a introducir " +  "personaje");
            personaje1 = keyboard.nextLine();
        }
        System.out.println("Por favor introduzca el oficio de su personaje 2, ponniendo nombre:oficio:pais:fuerza ");
        String personaje2 = keyboard.nextLine();
        String[] partes2 = personaje2.split(":", -1);
        while (partes2.length != 4){
            System.out.println("Oye, te has equivocado. Vuelve a introducir " +  "personaje");
            personaje2 = keyboard.nextLine();
        }
        int fuerza1 = Integer.parseInt(partes1[3]);
        int fuerza2 = Integer.parseInt(partes2[3]);
        System.out.println(partes1[0] + ":" + partes1[1] + " se enfrenta a " + partes2[0] +  ":" + partes2[1]);
        if (fuerza1 > fuerza2){
            System.out.println("Gana leyla");  
        }else{
            System.out.println("Ganada paco");
        }
       
        
    }
    
}
