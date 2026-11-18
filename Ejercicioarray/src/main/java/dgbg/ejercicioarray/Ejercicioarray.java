/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dgbg.ejercicioarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class Ejercicioarray {

    public static void main(String[] args) {
//        ordenarArray();
//ejercicio2();
ventaskill();
    }
    public static void ordenarArray(){
        int [] original = {30,2,8};
        int[] ordenado = new int[original.length];
        int posicion = 0;
        //Bucle que determina cada vuelta
        for (int pos = 0; pos < original.length; pos++) {
            int minimo = original[0];
            for (int i = 1; i < original.length; i++) {
                if (original[i]<minimo){
                    minimo = original [i];
                    posicion = i;
               }
            }
            //Cuando salgo ya tengo el minimo de cada vuelta
            ordenado[pos] = minimo;
            original [posicion] = Integer.MAX_VALUE;
            System.out.println("El mínimo es " +  minimo + " y la posición es: " + posicion);
            System.out.println(Arrays.toString(original));
        }
        System.out.println(Arrays.toString(ordenado));
    }
    public static void ejercicio2(){
        //ordenar de mayor a menor pero en el mismo array
        int [] original = {8,2,10};
        int posicion = 0;
        for (int pos = 0; pos < original.length; pos++) {
            int min = original[0];
            for (int i = 1; i < original.length; i++) {
                if (original[i] < min){
                    min = original[i];
                    posicion = i;
                }
             original [posicion] = min;
                System.out.println("El mínimo es: " + min + " y la posicion es: " + posicion);
            }
            
        }System.out.println(Arrays.toString(original));
        
           
    }
    public static void ejercicio2IA() {
    // Ordenar de mayor a menor en el mismo array
    int[] original = {8, 2, 10};

    for (int pos = 0; pos < original.length - 1; pos++) {
        int posicion = pos;

        for (int i = pos + 1; i < original.length; i++) {
            if (original[i] > original[posicion]) {
                posicion = i;
            }
        }

        int aux = original[pos];
        original[pos] = original[posicion];
        original[posicion] = aux;
    }

    System.out.println(Arrays.toString(original));
   }
    public static void ventaskill(){
        int presupuesto = 150;
        int[] skill = new int[6];
        for (int i = 0; i < skill.length; i++) {
            Scanner keyboard = new Scanner(System.in);
         System.out.println("Dime el precio de la skill");
         skill [i] = keyboard.nextInt();
        }
        for (int posicion = 0; posicion < skill.length; posicion++) {
            if (skill[posicion]<presupuesto) {
                System.out.println("Puedes comprarte la skill " + posicion);
            }else{
                System.out.println("No puedes comprar la skill " + posicion);
            }
        }
        
    }
}
