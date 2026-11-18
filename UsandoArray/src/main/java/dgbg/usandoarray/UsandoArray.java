/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgbg.usandoarray;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author usuariom
 */
public class UsandoArray {

    public static void main(String[] args) {
//        arraytest();
//        ejercicioarray();
ejercicio2array();
    }
    public static void arraytest(){
        //Denifinimos un array de 5 edades y lo rellenamos
        // 1ª Forma
        int[] edades = new int[5];
//        //lo rellenamos
        edades[0] = 2;
        edades[1] = 6;
//        // 2ª Forma : se crea el array y se rellena en una misma lìnea 
       int[] edades2 = {2,6,20,30,45};
//       // 3ª Forma
//       //Recorriendo el Array : se hace con un bucle 
        for (int i = 0; i < edades.length; i++) {
            edades[i] = ThreadLocalRandom.current().nextInt(0,121);
//            
            
        }
        System.out.println(edades);
        //No se puede montrar el array con un sout
        
        //Lo recorro con un for
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
        int i = 0;
        while ( i < edades.length){
           
           edades [i] = ThreadLocalRandom.current().nextInt(0,121);
            System.out.println(edades[i]);
            i++;
        }
        //Foreach, para ponerlo se pone fore y tabulador
        for (int edad : edades) {
            System.out.println(edades);
        }
   }
   public static void ejercicioarray(){
       int tamanio = 50;
       int [] edades2 = new int [tamanio];
       //Declaración y rellenado del array nombres
       String [] nombre = {"David","Carlos","Barreto","Hugo","Paco"};
     
       for (int posicion = 0; posicion < edades2.length; posicion++) {
           edades2 [posicion] = ThreadLocalRandom.current().nextInt(0,101);
           
       }
       //Recorremos los array y sacamos el nombre y su edad
       for (int posicion = 0; posicion < edades2.length; posicion++) {
           System.out.println(nombre[posicion] + " Tiene " + edades2[posicion]); 
       }
       for (int posicion = 0; posicion < nombre.length; posicion++) {
           edades2[tamanio] = ThreadLocalRandom.current().nextInt(0,121);
           System.out.println(nombre[posicion] + " tiene " + edades2[posicion]);
       }
      
      
   }
   public static void ejercicio2array(){
       int tamanio = 50;
       int [] edad = new int [tamanio];
       String [] nombre = {"David", "Barreto", "Jose", "Paco","Manuel"};
       for (int posicion1 = 0; posicion1 < edad.length; posicion1++) {
           edad[posicion1] = ThreadLocalRandom.current().nextInt(0,121);
           System.out.println(edad[posicion1]);
       }
       for (int posicion = 0; posicion < nombre.length; posicion++) {
           int contador = ThreadLocalRandom.current().nextInt(0,50);
           System.out.println(nombre[posicion] + " tiene " + edad[contador] + " anos  y he elegido la posición " + contador);
       }
   }
}
